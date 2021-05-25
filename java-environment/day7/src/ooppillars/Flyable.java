package ooppillars;

public interface Flyable {
	/*
	 * Use the 'default' keyword in an interface
	 * to provide an implementation for a method
	 */
	public default void fly() {
		System.out.println("Flying the 'standard' way...");
	}
}
