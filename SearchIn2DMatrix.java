
// Time Complexity : O(m+n)
// Space Complexity : O(1)


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;

        // Start from the top-right element
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];
            if (target == current) {
                return true; // Target found
            } else if (target < current) {
                col--; // Move left in the current row
            } else {
                row++; // Move down to the next row
            }
        }

        return false;
    }
}