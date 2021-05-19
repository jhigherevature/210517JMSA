package flowcontrol;

public class SwitchStatement {
	public static void main(String[] args) {
		/*
		 * switch statements compare a variable's value against provided case
		 * statements. When a match is found for the value of the variable and a case
		 * then the code associated with the case statement is executed...
		 * 
		 * switch statements are convenient when you know or have limited to the
		 * assignment of a variable's value in some way.
		 * 
		 * switch statements also exhibit 'fall-through' logic
		 * 
		 * switch Syntax:
		 * 
		 * switch (variable) { case value: optional-break; case value: optional-break;
		 * default: }
		 * 
		 * The default keyword is used to provide a block
		 * of code that will execute in the event that no matches
		 * are found for the variable you are checking against
		 * any other case statements. 
		 * 
		 * Although the default statement is usually placed at
		 * the end of a switch statement block, it can technically
		 * be placed anywhere
		 */
		String letter = "C";

		switch (letter) {
		default:
			System.out.println("too many letters...");
			break;
		case "A":
			System.out.println("A for Assembly");
			break;
		case "B":
			System.out.println("B for Binary");
			break;
		case "C":
			System.out.println("C for Compilation");
			break;
		}
	}
}
