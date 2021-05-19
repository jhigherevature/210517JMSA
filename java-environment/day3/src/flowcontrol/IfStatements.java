/*
 * The first line of code (readable by the compiler)
 * must be the package declaration for your class...
 */
package flowcontrol;

/*
 * Flow control is the concept in which we can 
 * change the execution order, or allow our programs
 * to repeat functionality through the use of built-in
 * reserved words/statements within Java, or through
 * the structure of how we architect our methods
 */
public class IfStatements {

	public static void main(String[] args) {
		/*
		 * Flow control statements (if, switch, loops...) apply to the next line of code
		 * or the next block of code
		 */
		int x = 5;

		if (x > 3)
			System.out.println("X is greater than 3");

		if (x < 0) {
			;
		}
		System.out.println("X is less than 0");

		/*
		 * Press CTRL + SHIFT + F 
		 * (CMD + SHIFT + F on mac) to 
		 * auto-format your code
		 */
		
		/*
		 * if statement syntax:
		 * 
		 * if (condition-boolean expression) {
		 * 		occurs when if-statement condition is true
		 * 		// block of code to execute
		 * } else {
		 * 		occurs when if-statement condition is false
		 * 		// block of code to execute
		 * }
		 */
		
		// this is just a reminder of x's value of 5
		x = 5;
		
		/*
		 * More general ranges should occur later 
		 * in our if-else statement blocks because
		 * if-else statements are mutually exclusive
		 */
		if (x < 2) {
			System.out.println("x is less than 2");
		} else if (x < 10) {
			System.out.println("x is still less than 10");
		} else if (x == 5) {
			// This will never be reached, due to the
			// previous condition
			System.out.println("x is equal to 5");
		} else {
			System.out.println("x is some other value");
		}
		
		int age = 14;
		boolean withParent = true;
		/* ANOTHER SOLUTION:
		 * 
			if (age >= 17 || age >= 13 & withParent) {
				movieAdmission('R');
			}
		*/
		
		if (age >= 17) {
			movieAdmission('R');
		} else if (age >= 13) {
			if (withParent) {
				movieAdmission('R');
			} else {
				movieAdmission('T');
			}
		} else {
			if (withParent) {
				movieAdmission('T');
			} else {
				movieAdmission('E');
			}
		}
		
	}
	
	public static void movieAdmission(char rating) {
		System.out.println("this performs actions based on the rating provided");
	}
}
