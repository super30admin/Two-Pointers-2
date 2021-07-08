// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start our "pointer" in the top-right
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n-1;
        
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else { // found it
                col--;
            }
        }

        return false;
    }
}