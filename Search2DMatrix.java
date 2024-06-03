// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Start from Bottom-Left Corner:Begin at the element at the bottom-left corner of the matrix, which is matrix[m-1][0].
//Iterate While Within Matrix Bounds: If the current element equals the target, return true.
//If the current element is less than the target, move right to the next column (col++).
//If the current element is greater than the target, move up to the previous row (row--).
//End Condition: If the loop exits (i.e., when row becomes less than 0 or col becomes greater than or equal to n), return false as the target is not found in the matrix.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;  // Return false if the input matrix is null or empty
        }

        int m = matrix.length;  // Number of rows
        int n = matrix[0].length;  // Number of columns
        int row = m - 1;  // Start at the last row
        int col = 0;  // Start at the first column

        // Iterate while the position is within the matrix bounds
        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) {
                return true;  // Target found
            } else if (target > matrix[row][col]) {
                col++;  // Move right if the target is greater than the current element
            } else {
                row--;  // Move up if the target is less than the current element
            }
        }

        return false;  // Return false if the target is not found
    }
}
