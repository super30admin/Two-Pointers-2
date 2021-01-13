// Time Complexity : o(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// As the each rows are sorted in ascending from left to right and columns from top to bottom, 
// I can start searching target from top right corner or left bottom corner.Also based on only these corner 
// we can decide which side our pointer should go.

public class SearchTwoDMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null || matrix.length == 0)
			return false;

		int m = matrix.length, n = matrix[0].length;
		int i = 0, j = n - 1;
		while (i < m && j >= 0) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}

}
