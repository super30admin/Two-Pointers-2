// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m - 1, c = 0;

        while(r >= 0 && c < n){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) r--;
            else c++;
        }

        return false;
    }
}