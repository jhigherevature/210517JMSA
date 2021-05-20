package loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		/*
		 * The break and continue statements provide
		 * more control over the execution flow of our
		 * looping structures.
		 * 
		 * break and continue will provide functionality to
		 * halt the execution of a loop entirely, or move
		 * to the next iteration cycle. This functionality
		 * (by default) occurs on the closest enclosing loop.
		 */
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				break; // this stops the loop entirely
			
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				continue; // this halts the current cycle
			
			System.out.println(i);
		}
		
		System.out.println("Outside of the For-Loop");
		
		for (char letter = 'A'; letter <= 'D'; letter++) {
			System.out.println("Outer For loop - cycle start");
			for (int number = 0; number < 4; number++) {
				if (number == 2) {
					break; // applied to inner-for loop
				}
				System.out.println(letter + ":" + number);
			}
			System.out.println("Outer For loop - cycle end");
		}
		
		for (char letter = 'A'; letter <= 'D'; letter++) {
			System.out.println("Outer For loop - cycle start");
			for (int number = 0; number < 4; number++) {
				if (number == 2) {
					continue; // applied to inner-for loop
				}
				System.out.println(letter + ":" + number);
			}
			System.out.println("Outer For loop - cycle end");
		}
		
		/*
		 * A label is a custom moniker/identifier that you
		 * apply to a loop that can be used in combination
		 * with break/continue statements for even more control! 
		 */
		outer : for (char letter = 'A'; letter <= 'D'; letter++) {
			System.out.println("Outer For loop - cycle start");
			inner : for (int number = 0; number < 4; number++) {
				if (number == 2) {
					break outer; // applied to inner-for loop
				}
				System.out.println(letter + ":" + number);
			}
			System.out.println("Outer For loop - cycle end");
		}
		
		outer : for (char letter = 'A'; letter <= 'D'; letter++) {
			System.out.println("Outer For loop - cycle start");
			inner : for (int number = 0; number < 4; number++) {
				if (letter == 'B')
					continue outer;
				
				if (number == 2) {
					break inner; // applied to inner-for loop
				}
				System.out.println(letter + ":" + number);
			}
			System.out.println("Outer For loop - cycle end");
		}
	}
}
