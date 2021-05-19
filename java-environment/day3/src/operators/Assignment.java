package operators;

public class Assignment {
	public static void main(String[] args) {
		int variable = 5 + 4;
		System.out.println(variable);
		
		int result = (variable = 15);
		System.out.println(result);
		System.out.println(variable);
		
		boolean someCheck = false;
		/*
		 *  this can be a bit confusing for new
		 *  developers, but the assignment operator changes
		 *  a value, in this case, we are not comparing 
		 *  the 'someCheck' variable to the boolean value
		 *  true, we are changing it to true
		 */
		if (someCheck = true) {
			System.out.println("We don't want this to print");
		}
		
		int twenty = 20;
		twenty += 5; // change 'twenty' to '25'
		System.out.println(twenty);
		
				// 26	- 5 = 21
		twenty = ++twenty - 5;
		twenty = twenty++ - twenty;
		/*
		 * When using operators the left-side must be
		 * a variable we are assigning the opertion to
		 * OR we must use the operator within another
		 * operation/within a method invocation
		 */
		takeNumberInput(++twenty);
	}
	
	public static void takeNumberInput(int value) {
		System.out.println(value);
	}
}
