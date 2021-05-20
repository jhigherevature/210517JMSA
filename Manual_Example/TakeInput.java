public class TakeInput {
	public static void main(String[] args) {
		/*
		This example is not very flexible:
		System.out.println(args[0]);
		System.out.println(args[1]);		
		*/

		// This version is flexible:
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}