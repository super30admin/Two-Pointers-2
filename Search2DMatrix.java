// Time Complexity :  O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // when we start from top right r[0][n-1]
        int m = matrix.length;
        int n = matrix[0].length;

        int r=0, c=n-1;
        while(r <m && c>=0) {
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else r++;

        }
        return false;
    }
}