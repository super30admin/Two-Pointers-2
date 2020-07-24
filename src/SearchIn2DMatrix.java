// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/**
 *  start either top right or bottom corner,
 *  based on target comparison with current number in matrix, ++/-- column or row.
 *  search till element found or bounds crossed
 */
/**
 * 
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 * 
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 *
 */
public class SearchIn2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {

		if(matrix == null || matrix.length ==0) return false;

		int i = 0, j = matrix[0].length - 1;
		while(i < matrix.length && j >= 0) {
			if(target == matrix[i][j]) {
				return true;
			}
			else if(target > matrix[i][j]) {
				i++; 
			} else {
				j--;
			}  
		}  
		return false;
	}
}
