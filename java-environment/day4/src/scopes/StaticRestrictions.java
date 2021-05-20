package scopes;

public class StaticRestrictions {

	public static int static_id = 12345;
	public int non_static_id = 54321;
	
	public static void main(String[] args) {
		staticMethod();
//		nonStaticMethod(); // error
		StaticRestrictions sr = new StaticRestrictions();
		sr.nonStaticMethod();
	}
	
	public static void staticMethod() {
		System.out.println("The static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("Non-static method");
	}
}
