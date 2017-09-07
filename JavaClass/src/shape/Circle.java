package shape;

public class Circle extends ShapeBuilder implements IShape {
	private double radius;
	public static class Builder extends ShapeBuilderBase<Builder, Circle> {
		private double radius;
		
		public Builder setRadius(double radius) {
			this.radius = radius;
        	return this;
        }

		@Override
		public Circle build() {
			return new Circle(this.radius);
		}
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
       
	@SuppressWarnings("finally")
	@Override
	public double getArea() {
		double volume = 0;

		try {
			volume = (Math.pow(this.radius, 2) * Math.PI);
		} catch (Exception ex) {

		} finally {
			return volume;
		}
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
