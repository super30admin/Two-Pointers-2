// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * Starting the search from lsat column in first row. If the target is lower than current number, we reduce the column to search for. Otherwise we reduce the row to search for.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = n - 1;

        while (r < m && c >= 0) {
            int current = matrix[r][c];
            if (current == target)
                return true;

            if (current > target)
                c--;
            else
                r++;
        }

        return false;
    }
}