package shape;

import shape.Circle.Builder;
import shape.ShapeBuilder.ShapeBuilderBase;

public class Rectangle extends ShapeBuilder implements IShape {
	private double x, y;

	public static class Builder extends ShapeBuilderBase<Builder, Rectangle> {
		private double x, y;
		
		public Builder setX(double x) {
			this.x = x;
        	return this;
        }
		
		public Builder setY(double y) {
			this.y = y;
        	return this;
        }

		@Override
		public Rectangle build() {
			return new Rectangle(this.x, this.y);
		}
	}
	
	public Rectangle( double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getArea() {
		double volume = 0;
		try {
			volume = this.x * this.y;
		}
		catch (Exception ex) {
			
		}
		return volume;
	}

	@Override
	public double getVolume() {
		return 0;
	}

	@Override
	public void printSummary() {
		System.out.printf("Summary: %s Area %f, Volume %f\n", this.getClass().getSimpleName(), this.getArea(), this.getVolume());
		
	}
}
