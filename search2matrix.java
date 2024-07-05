// Time Complexity : o(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Initialize the starting point at the top-right corner of the matrix
        int row = 0;
        int column = matrix[0].length - 1;
        
        // Iterate while the row index is within bounds and the column index is non-negative
        while (row <= matrix.length - 1 && column >= 0) {
            // If the target is found at the current position, return true
            if (matrix[row][column] == target) {
                return true;
            } 
            // If the current element is less than the target, move down to the next row
            else if (matrix[row][column] < target) {
                row++;
            } 
            // If the current element is greater than the target, move left to the previous column
            else {
                column--;
            }
        }
        // If the target is not found, return false
        return false;
    }
}
