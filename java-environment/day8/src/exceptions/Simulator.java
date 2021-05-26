package exceptions;

public class Simulator {
	public static void main(String[] args) {
		try {
			/*
			 * The try block should include the method/statements
			 * we want to execute
			 */
			sumOddNumbers(9,4);
		} catch (EvenNumberException e) {
			/*
			 * The catch statement should define what
			 * exceptions/errors we are expecting...as well
			 * as the logic we want to perform, in the event
			 * this thrown exception/error is 'caught'
			 */
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 * Finally will not execute if you:
			 * Manually force close your application using
			 * 	System.exit(0);
			 * 		The 'exit' method on the System class
			 * 		is a static method used to halt the 
			 * 		execution of your application. It takes
			 * 		an integer argument which effectively 
			 * 		translates to 'severity' of the exit
			 * 		strategy. 0 is essentially a 'full stop'
			 * 
			 * Finally will also not execute in the event
			 * of a catastrophic failure...like if you
			 * throw your computer out the window! (lose power)
			 */
			System.out.println("This will (almost) always execute");
		}
	}
	
	/*
	 * This method should only add odd numbers, if an Even Number is
	 * detected, we should communicate this through the use of our
	 * new custom exception
	 */
	public static int sumOddNumbers(int a, int b) throws EvenNumberException {
		/*
		 * When defining a method that can result in a problem, you
		 * should use the 'throws' declaration in the method signature,
		 * and then throw that exception within the body of your
		 * method, when a circumstance would result in that problem
		 * occuring
		 */
//		if (a%2==0 || b%2==0)
//			throw new EvenNumberException("an input was even");
		if (a % 2 == 0)
			throw new EvenNumberException("first input was even!");
		else if (b % 2 == 0)
			throw new EvenNumberException("second input was even!");
		
		return a+b;
	}
	
	public static void throwException() throws Exception {
		throw new Exception();
	}
	
	
	public static void examineRunTimeException() {
		int[] nums = {1,2,3};
		/*
		 * ArrayIndexOutOfBounds is a Runtime Exception
		 */
		System.out.println(nums[15]);
	}
}
