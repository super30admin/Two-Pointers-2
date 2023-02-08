// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * Take row and col pointers pointing to last row and first col in last row.
 * Then check if it is target, if so return true, else check if it is < target,
 * if so, increment col, else decrement row.
 *
 */
class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length - 1;
		int col = 0;
		while (row >= 0 && col < matrix[0].length) {
			if (matrix[row][col] == target)
				return true;
			else if (matrix[row][col] < target) {
				col++;
			} else {
				row--;
			}
		}
		return false;
	}
}