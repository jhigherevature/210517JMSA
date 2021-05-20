package arrays;

/*
 * Off Topic: Use the Refactor option in STS when you want to
 * move/rename a file/package
 */
public class Basics {
	/*
	 * Required components of Main method:
	 * 'public'
	 * 'static'
	 * 'void'
	 * 'main'
	 * 
	 * 'Array of Strings' >> String[] | String []
	 */
	public static void main(String pInEaPpLe[]) {
		/*
		 * When creating arrays you must declare
		 * the datatype of the elements of the array
		 * and only values of a matching datatype
		 * will be able to be placed within that
		 * array object
		 */
		int[] numbers  = new int[5]; // create a new array that can hold 5 elements
		
		/*
		 * Arrays use indexing to track the position
		 * of elements within an array. Indexing starts
		 * at 0.
		 * 
		 * syntax:
		 * NameOfArray[IndexPosition]
		 */
		numbers[0] = 5; // initialize the first element of numbers to 5
		numbers[1] = 10; // initialize the second element of numbers to 10
		numbers[2] = 15; // initialize the third element of numbers to 15
		numbers[3] = 20; // initialize the fourth element of numbers to 20
		numbers[4] = 25; // initialize the fifth element of numbers to 25
//		numbers[5] = 30; // error - runtime error : index out of bounds
		
		System.out.println(numbers[3]); // 20
		
		System.out.println(numbers.length); // can hold 5 elements
		
		System.out.println("The last index of an array"
				+ " is always one less than the length: "
				+ (numbers.length - 1));
		
		// another way to create arrays:
		int[] other_numbers = new int[] {1,2,3,4,5,6,7,8,9};
		
		// anonymous array assignment
		int[] other_other_numbers = {3,6,9,12,15,18};
		
		/*
		 * Default values for variables:
		 * Primitives : 0 for numbers
		 * 				false for booleans
		 * Reference Variables (objects) : null
		 */
		Object[] objects = new Object[4]; // {null, null, null, null}		
		numbers = new int[10]; // {0,0,0,0,0,0,0,0,0,0}		
		numbers = new int[] {1,2,3}; 		
		/*
		 * anonymous arrays can only be used when
		 * declaring arrays for the first time, not
		 * when we are reassigning the value
		 */
		// numbers = {2,4,6,8};
		
		/*
		 * Below are other ways Java recognizes arrays:
		 */
		boolean[] checks_1 = new boolean[3];
		boolean [] checks_2 = new boolean[3];
		boolean checks_3[] = new boolean[3];
		boolean checks_4 [] = new boolean[3];
	}
}
