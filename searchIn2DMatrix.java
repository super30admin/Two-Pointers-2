/**
Problem: https://leetcode.com/problems/search-a-2d-matrix-ii/
TC: O(m + n)
SC: O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int i = n - 1, j = 0;
        
        while (i >= 0 && i <= n - 1 && j >= 0 && j <= m - 1) {
            
            if (matrix[i][j] == target) {
                return true;
            }
            
            if (matrix[i][j] < target) {
                ++j;
            } else {
                --i;
            }
        }
        return false;
    }
}