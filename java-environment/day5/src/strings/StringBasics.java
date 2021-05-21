package strings;

public class StringBasics {
	public static void main(String[] args) {
		/*
		 * String literals - the direct interpretation
		 * 	of a sequence of characters that are placed
		 * 	between two double-quotes
		 */
		String word = "Word"; 
		String other = new String("Word");
		String another = "Word";
		
		System.out.println(word); // "Word"
		System.out.println(other); // "Word"
		System.out.println(word == other); // compare memory address - false
		System.out.println(word == another); // compare memory address - true
	}
}
