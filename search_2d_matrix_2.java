
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english-
/*
1. Start from the top-right corner of the matrix.
2. If the current element is equal to the target, return true.
3. If the current element is greater than the target, move left; if it's smaller, move down. Repeat until you find the target or go out of bounds.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1; // Start at top-right

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // Target is smaller, move left
            } else {
                row++; // Target is bigger, move down
            }
        }
        return false;
    }
}