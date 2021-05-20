package loops;

public class ForLoops {
	public static void main(String[] args) {
		/*
		 * For loops offer more control over the conditions
		 * and iterations for our loop
		 * 
		 * For loop Syntax:
		 * for (initialization; condition; modification) {
		 * }
		 * 
		 *  -initialization : A statement that executes one
		 *  				time at the start of our for loop's
		 *  				execution
		 *  -condition : A boolean expression that is used to 
		 *  			control when our for-loop will iterate. 
		 *  			So long as the condition is true, we will
		 *  			iterate through our loop.
		 *  			(for-loops treat conditions as 'true'
		 *  			by default)
		 *  -modification : A statement that executes at the
		 *  			end of each cycle of our for-loop's
		 *  			execution
		 */
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
		for (int x = 10; x > 0; x=x-2) {
			System.out.println(x);
		}
		
		for (int y = 15; y != 3; y=3) {
			System.out.println("This will only occur once!");
		}
		
		/*
		 * if you do not include any statements, the condition
		 * will be treated as 'true', and the loop will execute
		 * forever (or until it reaches a break/return statement)
		 */
		for ( ; ; ) {
			System.out.println("Will This print?");
			break;
		}
		
		String[] names = {"Abe", "Bill", "Chuck", "Darlene"};
		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index]);
		}
		
		/*
		 * enhanced for-loops are a short-hand for
		 * iterating through each item of an iterable
		 * collection of data.
		 * 
		 * enhanced for-loop syntax:
		 * 		the 'Datatype below should match the datatype of the collection'
		 * 	for (Datatype name : collection) {  }
		 */
		for (String currentName : names) {
			System.out.println(currentName);
		}
		
		String word = "Hello";
		for (char c : word.toCharArray()) {
			System.out.println(c);
		}
		/*
		 * The below doesn't work because Strings, in and of themselves
		 * are not an array of characters, although they hold onto
		 * the individual characters within an array
		 */
//		for (char c : word) {
//			
//		}
	}
}
