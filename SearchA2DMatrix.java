// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.
 
// Example 1:
// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true

// Example 2:
// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
// Output: false
 
// Constraints:
// m == matrix.length
// n == matrix[i].length
// 1 <= n, m <= 300
// -109 <= matrix[i][j] <= 109
// All the integers in each row are sorted in ascending order.
// All the integers in each column are sorted in ascending order.
// -109 <= target <= 109

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Base case: if input matrix is null or has no rows
        if (matrix == null || matrix.length == 0){
            return false;
        }

        int m = matrix.length;  // number of rows
        int n = matrix[0].length; // number of columns
        int row = 0; // starting from the top row
        int col = n - 1; // starting from the last column (top-right corner)

        // loop until we go out of bounds for the matrix
        while (row < m && col >= 0){
            if (matrix[row][col] == target){
                return true; // target found
            }
            else if (matrix[row][col] > target){
                col--; // moving left if current element is greater than target
            }
            else {
                row++; // moving down if current element is less than target
            }
        }
        return false; // target not found
    }
}