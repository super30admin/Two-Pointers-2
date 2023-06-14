package TwoPointers2;
/**
 * 
 * We start at the top right element in the array and then based on if the value is smaller or larger we move 
 * to the left (shift a col back) or move down(shift a row down) respectively.
 * 
 * Time Complexity :
 * O(m+n) where m is the rows and n is the cols of the input array
 * 
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem3 {
	public boolean searchMatrix(int[][] matrix, int target) {
		// start top right
		// either go left or down

		int row = 0;
		int col = matrix[0].length - 1;

		while (row <= matrix.length - 1 && col >= 0) {
			if (matrix[row][col] == target)
				return true;
			else if (matrix[row][col] > target)
				col--;
			else
				row++;

		}

		return false;
	}
}
