package unittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import shape.Circle;
import shape.Cylinder;
import shape.IShape;
import shape.Rectangle;
import shape.Cylinder.Builder;

public class ShapeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCircle() {
		IShape obj = new Circle.Builder()
				.setRadius(10293.4)
				.build();
		obj.printSummary();
		assertTrue(obj.getArea() > 0);
		assertTrue(0 == Double.compare(obj.getVolume(), 0));
	}

	@Test
	public void testCylinder() {
		IShape obj = new Cylinder.Builder()
				.setRadius(10293.4)
				.setHeight(1234)
				.build();
		obj.printSummary();
		assertTrue(obj.getArea() > 0);
		assertTrue(obj.getVolume() > 0);
	}
	@Test
	public void testRectangle() {
		IShape obj = new Rectangle.Builder()
				.setX(10293.4)
				.setY(1234)
				.build();
		obj.printSummary();
		assertTrue(obj.getArea() > 0);
		assertTrue(0 == Double.compare(obj.getVolume(), 0));

    IShape rect = new Rectangle.Builder()
        .setX(100)
        .setY(100)
        .build();
    rect.printSummary();
    //System.out.println(rect.getArea());
    //System.out.println(Double.compare(rect.getArea(), 10000.0));
    assertTrue(0 == Double.compare(rect.getArea(), 10000.0));
	}
}
