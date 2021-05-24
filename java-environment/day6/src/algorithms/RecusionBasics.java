package algorithms;

public class RecusionBasics {
	
	public static void main(String[] args) {
		printPositiveNumbers(3);
	}
	
	public static void recursive() {
		// this method is an infinite loop!
		System.out.println("This method is another"
				+ "way we can create an infinite loop");
		recursive();
	}
	
	public static void printPositiveNumbers(int i) {		
		System.out.println(i);
		if (i == 0) {
			/*
			 * Recursion specifically relies on
			 * the creation of some logic that will
			 * enable your looping method calls to
			 * halt, based on input from a previous
			 * execution within your recursive algorithm
			 * 
			 * Another way to put that: output from one
			 * method, can be used as input in another
			 * to determine when we want our recursive
			 * algorithm to stop execution. 
			 */
			return;
		}
		
		i = i - 1;
		printPositiveNumbers(i);
	}
}
