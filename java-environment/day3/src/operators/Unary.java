package operators;

public class Unary {
	/*
	 * Unary operations are applied to a single 
	 * expression
	 */
	public static void main(String[] args) {
		int post = 10;
		int pre = 10;
		
		System.out.println(post); // 10
		System.out.println(post++); // 10
		System.out.println(post); // 11
		
		System.out.println(pre); // 10
		System.out.println(++pre); // 11
		System.out.println(pre); // 11
		
		System.out.println(true); // true
		System.out.println(!true); // false
		
		System.out.println(false); // false
		System.out.println(!false); // true
	}
}
