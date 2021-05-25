package overloadingpreference;

public class Simulator {
	public static void main(String[] args) {
		method(5);
		method(5,5);
	}
	
	public static void method(long l) {
		System.out.println("Long");
	}
	
	public static void method (int i) {
		System.out.println("int");
	}
	
	public static void method (byte b) {
		System.out.println("byte");
	}
	
	public static void method (int x, int y) {
		System.out.println("two ints");
	}
	
	public static void varargs(int... args) {
		System.out.println("varargs");
	}
}
