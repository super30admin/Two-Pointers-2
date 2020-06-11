
// Time Complexity : O(m + n) --> where m & n are length of row and column of the 2D matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (240): Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n - 1;
        
        while (r < m && c >= 0) {
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }
}