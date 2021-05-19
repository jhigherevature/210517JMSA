package operators;

public class Binary {
	/*
	 * Binary operations are applied to two
	 * expressions and return a single expression
	 * as the result
	 */
	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		
		/*
		 * When converting between decimal and whole
		 * numbers, the values after the decimal are
		 * truncated, the number is not rounded
		 */
		int decimal = (int)99.99999;
		System.out.println(decimal);
		
		System.out.println(x * y); // 10
		System.out.println(x / y); // 2 (not 2.5 - truncation)
		System.out.println(x % y); // the remainder is 1
		
		System.out.println(x + y); // 7
		System.out.println(x - y); // 3
		
		System.out.println(x > 5); // false - a number is not greater than itself
		System.out.println(x < 5); // false - nor is it less than itself
		System.out.println(x >= 5); // true
		System.out.println(x <= 5); // true
	}
}
