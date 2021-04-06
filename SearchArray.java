
// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start the pointer in the bottom-left
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            // Navigate row and column by comparing ucrrent value to target
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                return true;
            }
        }

        return false;
    }
}