package finalkeyword;

public class FinalMethod {
	/*
	 * Methods which use the final keyword cannot
	 * be overridden in child classes
	 */
	public final void method() {
		System.out.println("This cannot be overridden");
	}
}
