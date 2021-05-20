package methods;

public class Basics {
	/*
	 * When you assign a value to a field on a class, the field is only give its
	 * value/initialized, when an object is created from the class, but it does not
	 * have inherent value on the class itself...
	 * 
	 * Unless we use the 'static' keyword!
	 */
	public int id = 12345;
	public String name = "Joseph";

	/*
	 * the static keyword will initialize values on fields on the actual class
	 * definition, not just when we create objects using the class template
	 */
	public static String staticName = "Static";

	public static void main(String[] args) {
		System.out.println(staticName);

		Basics b = new Basics();
		System.out.println(b.id);
		System.out.println(b.name);
		b.printInput("Joseph", 12345);

		System.out.println("using 'b': " + b.staticName);
		Basics b2 = new Basics();
		System.out.println("using 'b2': " + b2.staticName);
		b.staticName = "New Value";
		b.name = "b1 Name - Kyle";
		b2.name = "b2 Name - Jennifer";
		System.out.println("using 'b': " + b.staticName);
		System.out.println("using 'b2': " + b2.staticName);

		System.out.println("using 'b': " + b.name);
		System.out.println("using 'b2': " + b2.name);
		/*
		 * Invoking a method means that we state the name of a method (usually based on
		 * a created instance of a class (i.e. object), using dot notation.
		 * 
		 * When you invoke a method, if you pass input to the parameter locations, these
		 * inputs are referred to as the 'arguments'
		 * 
		 * 'My Input' is the String argument, that fulfills the list of parameters (i.e.
		 * the 'input' from below)
		 */
		b.printInput("My Input", 15);
		System.out.println("Prior to invoking our method");
		int number = b.returnTwenty();
		System.out.println("After method execution has concluded");
	}

	// 'input' is the name of the String parameter for our method
	public void printInput(String input, int num) {
		System.out.println(input + " " + num);
	}

	public void printInput(int num, String input) {
		System.out.println(num + " , " + input);
	}

	// overloaded printInput method
	public void printInput() {
		System.out.println("You should provide some arguments next time!");
	}

	// overloaded printInput method
	public void printInput(String input) {
		System.out.println(input);
	}

	public int returnTwenty() {
		System.out.println("Start of Return Twenty method");
		/*
		 * When we declare a return type (other than void) for a method, we must use the
		 * return keyword and provide an expression to be returned that matches the
		 * datatype declared in the method signature.
		 * 
		 * The return keyword performs two operations with regard to our method.
		 * 
		 * 1 - allows for the assignment/use of the associated expression similar to
		 * binary/unary/ternay operators... 2 - additional halts the execution of code
		 * within your method, and returns program control back to the executing
		 * location
		 */
		System.out.println("Near the end, returning 20");
		return 20;
//		System.out.println("End of Return Twenty method"); // unreachable code
	}

}
