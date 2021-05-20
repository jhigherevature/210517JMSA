package arrays;

public class MultiArray {
	public static void main(String[] args) {
		/*
		 * Java supports multi-dimensional arrays by
		 * using multiple sets of square brackets
		 */
		int[][] numberTable = new int[5][5];
		numberTable[0][0] = 1;
		numberTable[0][1] = 3;
		numberTable[0][2] = 5;
		numberTable[0][3] = 7;
		numberTable[0][4] = 9;
		
		numberTable[1][0] = 2;
		numberTable[1][1] = 4;
		numberTable[1][2] = 6;
		numberTable[1][3] = 8;
		numberTable[1][4] = 10;
		
		/*
		 * Below showcases a slightly more visual representation
		 * of a multi-dimensional array
		 */
		int[][] positions = new int[][] {
											{1,2,3},
											{4,5,6},
											{7,8,9}
										};
										
		int[][][] vectors = new int[][][] {
												{
													{1,2,3},
													{4,5,6},
													{7,8,9}
												},
												{
													{11,12,13},
													{14,15,16},
													{17,18,19}
												}
											};
	}
}
