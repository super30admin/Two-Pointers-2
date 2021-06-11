// Time Complexity : O(M+N) //M rows and N columns
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. start from bottom row find which row range the target might exist.
 * 2. in that row find target till the array element is less than target.
 */
public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(target> matrix[matrix.length-1][matrix[0].length-1]) return false;
		
		int row = matrix.length - 1;
		int col = 0;

		while (row >= 0 && col < matrix[0].length) {
			if (matrix[row][col] > target) {
				row--;
			} else if (matrix[row][col] < target) {
				col++;
			} else { // found it
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		int[][] matrix= new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(new SearchMatrix().searchMatrix(matrix, 20));
	}
}
