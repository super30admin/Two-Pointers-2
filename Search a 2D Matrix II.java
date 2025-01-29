// TC = O(m + n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // TC = O(m + n), SC = O(1)
        // null
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        // staircase algo starting from top right corner
        int i = 0, j = n - 1;
        while(i < m && j >= 0) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) ++i;
            else --j;
        }
        return false;
    }
}