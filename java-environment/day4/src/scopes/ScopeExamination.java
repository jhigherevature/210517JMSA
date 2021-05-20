package scopes;

public class ScopeExamination {
	/*
	 * instance scope : variables that are accessible
	 * 		throughout the lifetime of an object.
	 * 		-declare variables outside of any method
	 * 		within a class, and do not use the static
	 * 		keyword
	 */
	public String instanceString = "Instance Scope String";
	
	/*
	 * static scope : variables that are accessible
	 * 		throughout the lifetime of our applications 
	 * 		(specifically, so long as the class definition
	 * 		is accessible in our program).
	 * 		-declared using the static keyword
	 */
	public static String staticString = "Static Scope String"; 
	
	public String methodString = "This is actually an instance Scope String";
	
	public static void main(String[] args) {
		ScopeExamination se = new ScopeExamination();
		System.out.println(se.instanceString);
//		System.out.println(instanceString);
//		System.out.println(se.methodString);
		se.method();
		/*
		 * The 'this' keyword is a reference to
		 * the current object. It is used to disambiguate
		 * between variables that exist in different scopes
		 *  (particularly instance and local variables).
		 */
	}

	/*
	 * method scope : variables within a method scope only
	 * 		have context while the method in which it is
	 * 		created is still executing
	 */
	public void method () {
		String staticScope = "Actually a Method Scope String";
		String methodString = "Method Scope String";
		
		/*
		 * when you reference a variable within a method, 
		 * java will default to the last created variable
		 * using that name, specifically, any that exist
		 * in the method scope first. This is called 
		 * 'variable shadowing'.
		 * 
		 * variable shadowing : the variables created at
		 * 		a class level will reside in the 'shadow'
		 * 		of variables created in the method
		 * 
		 * You can use the 'this' keyword to disambiguate
		 * between the local scope variables and the class/instance
		 * scope variables
		 */
		System.out.println(methodString);
		System.out.println(this.methodString);
		
//		String blockString = "Actually a method string...";
		if (true) {
			String blockString = "Block Scope String";
			System.out.println(blockString);
		}
		/*
		 * block scope : variables created within a block
		 * 		(flow controls statements) are only 
		 * 		accessible within the flow control
		 * 		statement in which they are declared
		 */
//		System.out.println(blockString);
	}
}
