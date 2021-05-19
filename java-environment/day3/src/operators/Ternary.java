package operators;

public class Ternary {

	public static void main(String[] args) {
		/*
		 * Ternary operators act as short-hand methods
		 * to create an if-else statement, although
		 * they are still operators and must still be used
		 * as part of another operation/assigned to a variable
		 * 
		 * Ternary Syntax:
		 * 	 (condition-boolean expression) ?  expr-to-return-when-true : expr-to-return-when-false
		 * 		condition ? expr_1 : expr_2;
		 */
		
		int x = true ? 15 : 25; // assign 15 to x
		int y = false ? 15 : 25; // assign 25 to y
		
		/*
		 * The following examples are a bit complex...don't 
		 * do this when programming, unless you have a specific
		 * reason
		 */
		int result = (x > y) ? returnTwenty() : (true ? 21 : 7 + 5);
		int sum = ((x == 25) ? (x / 3) : (y > 4 ? 21 : 7 + 5));
	}
	
	public static int returnTwenty() {
		return 20;
	}
	
	public static int returnFive() {
		return 5;
	}

}
