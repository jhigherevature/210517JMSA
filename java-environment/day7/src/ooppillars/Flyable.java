package ooppillars;

public interface Flyable {
	/*
	 * Use the 'default' keyword in an interface
	 * to provide an implementation for a method
	 * 
	 * variables declared on an interface are implicitly
	 * public static and final.
	 * This means you can access the field anywhere, 
	 * the field belongs to the interface and not instances
	 * of the interface (i.e. classes which implement the 
	 * interface), and you cannot change the value of the
	 * field once it has been initialized.
	 */
	public static final int id = 12345;
	
	public default void fly() {
		System.out.println("Flying the 'standard' way...");
	}
	
	public void soar();
}
