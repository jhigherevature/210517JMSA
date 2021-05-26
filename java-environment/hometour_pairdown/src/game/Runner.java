package game;

import java.util.Scanner;

import fixtures.Room;

public class Runner {
	/* We only need one room manager, 
	 * so we will make it static
	 */
	private static RoomManager manager;
	
	// Boolean used to control when our game is running. We set it to true initially
	private static boolean running = true;
		
	// Main method
	public static void main(String[] args) {
		// Run the init method to instantiate our house
		manager.init();

		/*
		 * When we want to print our menu, should
		 * we do so using println statements here? or
		 * should we invoke a method?
		 */
		
		while (running) {
			/* Main logic for game
			 *  -ask for input
			 *  -update and output our location
			 */
		}
		
		// After the game ends...
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	/* 
	 * Utility method to print info about current room
	 * Should we place this in a different class?
	 */
	private static void printRoom(Player player) {
	}
	
	/* 
	 * Utility Method used to gather input from the user 
	 * and convert it to an array we can parse...
	 * specifically it will return an array of Strings
	 * separating the words using a space
	 */
	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String[] phrase = input.split(" ");
		return phrase;
	}
	
	/*
	 * This method should take an array of Strings and
	 * update the player's position based on the input
	 * received (or even exit the game)
	 * 
	 * parse - analyze (a sentence) into parts and describe
	 *   their syntactic roles...
	 * 
	 * What do each of the words of our String array input
	 * represent? If someone enters "MOVE NORTH" what should
	 * happen? or "PICK UP LAMP", etc...
	 * 
	 * NOTE:
	 *   using toLowerCase() or toUpperCase() on a String will
	 *   help when parsing input
	 *   i.e. should there be a difference between:
	 *   	"move"
	 *   	"MOVE"
	 *   	"Move"
	 *   	"moVe"
	 */
	private static void parse(String[] command, Player player) {
		
	}
}
