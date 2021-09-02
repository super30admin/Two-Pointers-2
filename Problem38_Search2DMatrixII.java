// Time Complexity : O(m + n), m -> no. of rows, n -> no. of cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        while(row >= 0 && col <= matrix[0].length - 1) {
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                row--;
            else
                col++;
        }
        return false;
    }
}