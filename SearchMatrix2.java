// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // start at the top right
        int i = 0;
        int j = cols - 1;
        
        while (i < rows && j >= 0) {
            
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        
        return false;
    }
}