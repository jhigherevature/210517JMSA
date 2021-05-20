package methods;

/*
 * varargs stands for 'variable arguments list'. A
 * var args parameters can be used when defining methods
 * in place of an array, to allow java to create an array
 * using the last n number of arguments passed when invoking
 * the method in question
 * 
 */
public class Varargs {
	// varargs can also be used with our main method signature
	public static void main(String... args) {
		String[] words = {"one", "two", "three"};
//		String... varArgsArray = {};
		printUsingArray(words);
		
		printUsingVarArgs("one", "two");
	}

	public static void printUsingArray (String[] arr) {
		for (String element : arr) {
			System.out.println(element);
		}
	}
	
	public static void printUsingVarArgs (String... arr) {
		/*
		 * specifically, java will create an array using
		 * the last n number of arguments passed to this
		 * method when invoking it
		 */
		for (String element : arr) {
			System.out.println(element);
		}
	}
	
	// overloaded version for character primitives
	public static void printUsingVarArgs (char... arr) {
		for (char element : arr) {
			System.out.println(element);
		}
//		System.out.println(element); // element is out of scope
	}
	
	// overloaded version for integer primitives
//	@Override
	public static void printUsingVarArgs (int... arr) {
		for (int element : arr) {
			System.out.println(element);
		}
	}
	
	/*
	 * Annotations (in java) use the '@' symbol
	 * and provide additional context and functionality
	 * (or limit functionality in some cases) that
	 * is either descriptive of the proceeding entity
	 * or provides context with regard to the entity.
	 * 
	 * the 'entity' referred to above can be a 
	 * field/method/class/interface...
	 */
	@Override
	public String toString() {
		return "";
	}
	
//	@Override
//	public String toStirng () {
//		return "This is trying to override toString";
//	}
}
