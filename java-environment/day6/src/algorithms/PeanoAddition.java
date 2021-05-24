package algorithms;

public class PeanoAddition {
	/*
	 * Base Case : "What scenario/input provides
	 * a simple and expected output for our algorithm
	 * that we can slowly 'move' toward"
	 */
	
	/*
	 * Peano Addition is a recursive algorithm for
	 * adding numbers together that is based on the
	 * concept that, two numbers, when equally altered
	 * in the opposite direction (i.e. add n to one value
	 * and subtract n from the other) will maintain their
	 * total combined value.
	 * 
	 * 5 + 10 = 15
	 * 4 + 11 = 15
	 * 3 + 12 = 15
	 * ...
	 * 0 + 15 = 15
	 *
	 * Named after Guiseppe Peano
	 */
	public int peanoAddition(int x, int y) {
		if (x == 0)
			return y;
		else
			return peanoAddition(--x, ++y);
	}
	/*
	 * First time:
	 * 		x = 3 | y = 5
	 * Is x == 0? NO
	 * 
	 * return the 'answer' from: peanoAddition(--x, ++y)
	 * 
	 * Second time:
	 * 		x = 2 | y = 6
	 * Is x == 0? NO
	 * 
	 * return the 'answer' from: peanoAddition(--x, ++y)
	 * 
	 * Third time : 
	 * 		x = 1 | y = 7
	 * Is x == 0? NO
	 * 
	 * return the 'answer' from: peanoAddition(--x, ++y)
	 * 
	 * Fourth Time:
	 * 		x = 0 | y = 8
	 * is x == 0? YES
	 * return 8;
	 */
}
