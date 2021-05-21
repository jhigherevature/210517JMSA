package strings;

public class StringBuilder_Buffer {

	public static void main(String[] args) {
		/*
		 * StringBuilder and StringBuffer create String-like
		 * objects that are mutable (their values can be changed)
		 * The difference between StringBuilder and StringBuffer
		 * is that StringBuffer is thread-safe.
		 */
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.append(" World!");
		System.out.println(sb);
		sb.replace(0, 6, "REPLACED");
		System.out.println(sb);
		sb.insert(3, "-inserted-");
		System.out.println(sb);
	}

}
