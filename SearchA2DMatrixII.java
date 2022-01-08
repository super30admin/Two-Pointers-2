class Solution {
    // Time Complexity : O(m+n), where m is the no of rows and n is the no of columns of the matrix
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = n-1;

        while(r < m && c >= 0) {
            if(target == matrix[r][c]) {
                return true;
            } else if(target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}