package exceptions;

public class Division {
	
	/*
	 * We are adding some arbitrary code, just to highlight how
	 * the stacktrace works as a tool in STS/eclipse
	 */
	public static void someMethod() {
		System.out.println("This is a random method");
	}
	
	public static void divide(int a, int b) {
		System.out.println("a / b :" + a/b);
	}
	
	public static void throwException() throws EvenNumberException {
		throw new EvenNumberException("Demonstration purposes");
	}
}
