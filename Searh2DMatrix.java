
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english

/**
 * Starting from the top right cornor we can traverse through the matrix based
 * on target value. If the target id greater than top right cornor we move down
 * or if its smaller we move left, till we find the target or exceed bounds.
 */

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length - 1;
        int m = matrix[0].length - 1;

        int i = 0, j = m;
        while (0 <= i && i <= n && 0 <= j && j <= m) {
            if (matrix[i][j] == target)
                return true;

            else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}