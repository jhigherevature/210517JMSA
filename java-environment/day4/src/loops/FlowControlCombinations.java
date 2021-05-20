package loops;

public class FlowControlCombinations {

	public static void main(String[] args) {
		/*
		 * how would I print out the position and number
		 * for any odd value from the array below?
		 */
		int[] arr = {2,4,6,1,13,45,8,10,-3};
		int index = 0;
		while (index < arr.length) {
			// print the elements of an array
//			System.out.println(arr[index]);
//			System.out.println("isOdd?: " + (arr[index]%2 == 1));
			/*
			 * Math.abs() is a method i
			 */
			if (Math.abs(arr[index]%2) == 1) {
				// print position
				// print number
				System.out.println("position: " + index
						+ ", value: " + arr[index]);
			}
			// increase the count
			index++;
		}
	}
}
