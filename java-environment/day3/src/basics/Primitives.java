package basics;

public class Primitives {
	
	/*
	 * CTRL + Space opens the context
	 * menu in STS. This gives you
	 * suggestions based on what you
	 * have typed for auto-completion
	 * of a line/lines of code
	 */
	// CTRL + '/' to create a single-line comment
	
	/*
	 * A variable is a construct that is used to
	 * hold a single value/information
	 * 
	 * In Java variables are divided into two
	 * broad categories, primitives and references.
	 */
	byte b = 127;
	short s = 12345;
	int i = 1000000;
	
	// Moving from smaller data type (byte) to larger (int) is upcasting
	int byteAsInt = b;
	
	/*
	 * Moving from large (int) to smaller (byte) 
	 * is down casting, and must be explicitly stated
	 */
	byte intAsByte = (byte)byteAsInt;
	
	long l = 10000000000L; // use an 'L' to indicate a long value
	float f = 1000000.000f; // use an 'f' to indicate a float value
	double d = 100000000.00;
	
	char c = 'a'; // Characters use single-quotes in java
	boolean bool = true; // true/false value
	
	/*
	 * Java numbers can be represented as
	 * 	Binary : 0b
	 * 	Octal : 0
	 * 	Decimal : 'normal'
	 * 	Hexadecimal : 0x
	 */
	public static void main(String[] args) {
		int binary = 0b11010;
		int octal = 032;
		int decimal = 26;
		int hexadecimal = 0x1A;
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(decimal);
		System.out.println(hexadecimal);
		
		byte large = (byte)128;
		
		System.out.println(large);
		
		int tooLarge = 0b0001_0000_0000;
		byte casted = (byte)tooLarge;
		System.out.println(tooLarge);
		System.out.println(casted);
	}
}
