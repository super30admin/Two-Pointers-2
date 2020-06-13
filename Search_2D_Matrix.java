// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Search_2D_Matrix {
	/*
	 * In this function we start at the top right side of the matrix with row set to
	 * 0 and column set to the last column, at each iteration we check if target is
	 * less than the current element, if so we increase the row, else we decrease
	 * the column, if target is found we return true, else false
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int r = 0;
		int c = n - 1;
		while (r < m && c >= 0) {
			if (matrix[r][c] == target) {
				return true;
			}
			if (matrix[r][c] > target) {
				c--;
			} else {
				r++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 5000;
		System.out.println(searchMatrix(matrix, target));
	}
}