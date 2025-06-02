// Approach:
// Start from the top-right corner of the matrix.
// If the target is less than the current element, move left.
// If the target is greater than the current element, move down.
// Repeat until the target is found or the indices go out of bounds.

// Time Complexity : O(m + n) - at most m down moves and n left moves
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        int col = matrix[0].length - 1; // Start at the last column
        int row = 0;                    // Start at the first row

        // Loop until indices go out of bounds
        while (col >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false; // Target not found
    }
}
