package scanner;

import java.util.Scanner;

public class ScanSimulator {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * CTRL + SHIFT + O - Automatic import hotkey combination
		 */
		
		/*
		 * When you invoke a 'next' method, such as
		 * 'next()', or 'nextDouble()' or 'nextInt()' your
		 * scanner object will scan the next token, and it
		 * it's datatype matches the expected return type
		 * for the method, it will return that data. If
		 * the datatype does not match (or an implicit conversion
		 * cannot be performed), you will get an type mismatch
		 * exception
		 */
		System.out.println("Give me some input: ");
		String text = scan.next();
		System.out.println("Your input was: " + text);
		
		System.out.println("Give me a number: ");
		int num = scan.nextInt();
		System.out.println("The number was: " + num);
		
		/*
		 * Once a stream is closed, it cannot be reopened
		 * 
		 * as such, always close your streams when you are
		 * completely finished with it
		 */
//		scan.close();
	}
}
