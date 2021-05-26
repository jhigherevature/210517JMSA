package projectone;

import java.util.Scanner;

public class SimpleMenu {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		/*
		 * System.out.println is a debugging statement. You do NOT
		 * use System.out.println to communicate to a user of a system
		 * in any capacity, other than 'users' who are other developers
		 * strictly using your program/writing code with you and executing
		 * your classes directly...even then, in production environments, 
		 * loggers are typically used. Debugging statements exist for the 
		 * sole purpose of helping you as a developer!
		 */
		System.out.println("Your input was: " + input);
	}
}
