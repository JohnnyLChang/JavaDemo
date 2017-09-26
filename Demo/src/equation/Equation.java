package equation;

public class Equation {
	private double x;
	private String e;
	
	public Equation() {
		
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void set(String e) {
		this.e = e;
	}
	
	public boolean compile() {
		for (char ch: this.e.toCharArray()) {
		}
		return false;
	}

	public double execute() {
		return 0.0;
	}
}
