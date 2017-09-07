package shape;

import shape.Circle.Builder;
import shape.ShapeBuilder.ShapeBuilderBase;

public final class Cylinder extends ShapeBuilder implements IShape {
	private double radius;
	private double height;

	public static class Builder extends ShapeBuilderBase<Builder, Cylinder> {
		private double radius;
		private double height;

		public Builder setRadius(double radius) {
			this.radius = radius;
			return this;
		}

		public Builder setHeight(double height) {
			this.height = height;
			return this;
		}

		@Override
		public Cylinder build() {
			return new Cylinder(this.radius, this.height);
		}
	}

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	//半徑x半徑x3.14x2+半徑x2x3.14x柱高 
	@SuppressWarnings("finally")
	@Override
	public double getArea() {
		double area = 0;
		try {
			double baseArea = (Math.pow(this.radius, 2) * Math.PI);
			area = baseArea*2 + this.radius * 2 * Math.PI * height;
		} catch (Exception ex) {

		} finally {
			return area;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public double getVolume() {
		double volume = 0;

		try {
			double baseArea = (Math.pow(this.radius, 2) * Math.PI);
			volume = baseArea * this.height;
			return volume;
		} catch (Exception ex) {

		} finally {
			return volume;
		}
	}
	
	@Override
	public void printSummary() {
		System.out.printf("Summary: %s Area %f, Volume %f\n", this.getClass().getSimpleName(), this.getArea(), this.getVolume());
		
	}
}
