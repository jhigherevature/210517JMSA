package objects;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * Wrapper classes act as (its name implies)
		 * a 'wrapper' around a datatype. Effectively
		 * we can represent one datatype as an instance
		 * of another using a wrapper class for
		 * that data.
		 */
		int num = 9;
		
		/*
		 *  'Integer' is the wrapper for int
		 *  it allows us to observe the 'int'
		 *  datatype as if it were an object
		 */
		Integer number = num;
		
//		num = null; // error - cannot assign 'null' to primitive
		number = null; // flexibility with wrappers
		
		// autoboxing
		/* 
		 * note: because of the previous line
		 * the following would result in a runtime
		 * error because I cannot assign a null
		 * reference to a primitive
		 */
		num = number; 	/* you can switch between object 
						 * and wrapper representations
						 * through the process known as
						 * autoboxing : primitive > object
						 * and unboxing : object > primitive
						 */
		// unboxing
		number = num;
	}
}
