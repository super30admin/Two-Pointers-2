// Time Complexity : O(n + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int row = matrix.length - 1;
        int col = 0;
        
        while(row>=0 && col < matrix[0].length){
            if (matrix[row][col] > target)
                row--;
            else if (matrix[row][col] < target)
                col++;
            else
                return true;
        }
        return false;
    }
}