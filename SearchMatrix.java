// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = 0, j = n-1;
        
        while (i < m && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            } else if (target > matrix[i][j]) {
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            }
        }
        return false;
    }
}