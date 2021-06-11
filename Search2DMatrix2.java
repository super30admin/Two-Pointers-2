// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

/**
 * In this problem, I have used 2 pointers i and j to start at the last row and first column
 * we can start at the first element as rightwards on the row and downwards on the column, we can not move as both the sides are increasing
 * When we choose last col and first index, upwards is decreasing and rightwards, it is increasing
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int i = rows - 1;
        int j = 0;
        
        while (i >= 0 && j < cols) {
            int cur = matrix[i][j];
            
            if(cur > target) {
                i--;
            } else if (cur < target) {
                j++;
            } else if (cur == target) {
                return true;
            }
        }
        
        return false;
    }
}