// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // TC: O(m + n)
        // SC: O(1)
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m - 1;
        int j = 0;
        while(i >= 0 && j < n) {
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target) {
                i--;
            }
            else {
                j++;
            }
        }
        return false;
    }
}