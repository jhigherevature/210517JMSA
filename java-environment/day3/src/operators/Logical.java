package operators;

public class Logical {
	public static void main(String[] args) {
		/*
		 * 
		 */
//		System.out.println(true & true); // true
//		System.out.println(true & false); // false
//		System.out.println(false & true); // false
//		System.out.println(false & false); // false
//		int x = 10;
//		System.out.println(x > 5 & x < 2);
//		
//		System.out.println(true | true); // true
//		System.out.println(true | false); // true
//		System.out.println(false | true); // true
//		System.out.println(false | false); // false
		
		int value_1 = 1290 * 123;
		int value_2 = 1209810938 / 134;
//		System.out.println(false & (value_1 > value_2));
		
		/*
		 * For shortcircuit AND - the first operand must be
		 * 		false for the short circuit to take place
		 * 
		 * For shortcircuit OR - the first operand must be
		 * 		true for the short circuit to take place
		 * 
		 */
		System.out.println(printAndReturnFalse() && printAndReturnTrue());
		System.out.println(printAndReturnTrue() && printAndReturnFalse());
	}
	
	public static boolean printAndReturnFalse() {
		System.out.println("This will return FALSE!");
		return false;
	}
	
	public static boolean printAndReturnTrue() {
		System.out.println("This will return TRUE!");
		return true;
	}
}
