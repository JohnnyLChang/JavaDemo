package hello;

public class MyMath implements ISimpleMath {

	@Override
	public int add(int a, int b) {
		int c =  a + b;
		return c;
	}

	@Override
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	@Override
	public int multi(int a, int b) {
		int c = a * b;
		return c;
	}

}
	