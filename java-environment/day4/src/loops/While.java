package loops;

public class While {

	public static void main(String[] args) {
		/*
		 * Loops are structures that will repeat some
		 * code (through a process called 'iteration')
		 * based on a boolean expression used as a condition.
		 * 
		 * While loops are the most basic looping structure
		 * they have the following syntax:
		 * 
		 * while (boolean_expression) {
		 * 		associated code...
		 * }
		 */
		int whileCount = 100;
		while (whileCount < 10) {
			System.out.println("The current count [while] "
					+ "is: " + whileCount);
			whileCount++;
		}
		System.out.println("Outside of While loop. While Count "
				+ "is: " + whileCount);
		
		
		int doCount = 100;
		do {
			System.out.println("The current count [do-while] "
					+ "is: " + doCount);
			doCount++;
		} while (doCount < 10);
		System.out.println("Outside of do-While loop. doCount "
				+ "is: " + doCount);
	}
}
