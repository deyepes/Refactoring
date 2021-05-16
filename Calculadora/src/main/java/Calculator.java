
public class Calculator {

	public Calculator() {
		throw new IllegalStateException();
	}

	public static int sum(int x, int y){
        return x+y;
    }
	
	public static int subtraction(int x, int y) {
		return x-y;
	}
	
	public static int multiplication(int x, int y) {
		return x*y;
	}
	
	public static int division(int x, int y) {
		return x/y;
	}

	public static double sum(double x, double y) { return 0;}
}
