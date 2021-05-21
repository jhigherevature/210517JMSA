package strings;

public class StringMethods {
	public static void main(String[] args) {
		String sentence = new String("This Is My Sentence");
		String equal = "This is my SenTEnce";
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence);
		
		System.out.println(sentence == equal); // compare memory address
		System.out.println(sentence.equals(equal)); // compare values
		System.out.println(sentence.equalsIgnoreCase(equal)); // compare values, ignoring casing
		
		/*
		 * the String.substring method has overloaded versions
		 * that take two integer parameters, one for the
		 * starting index, and another for the ending index
		 * 
		 * It will return a String object based on the set of
		 * characters between the two indexes provided. This is
		 * inclusive of the first index, and exclusive of the second
		 */
		String sub = sentence.substring(5, 11);
		System.out.println("The substring starting at index 5, and ending at index 11: " + sub);
		
		String[] split = sentence.split(" ");
		
		for (String s : split) {
			System.out.println(s);
		}
		
		/*
		 * The intern method is used to observe the string
		 * as if it were in the String pool
		 */
		sentence = sentence.intern();
	}
}
