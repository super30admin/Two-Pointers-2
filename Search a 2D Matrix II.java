// Time Complexity : O(m+n), where m is number of rows and n is number of columns in the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, it successfully ran on Leetcode. Was easy to implement after the discussion

// Code
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] < target){
                row++;
            }else if(matrix[row][column] > target){
                column--;
            }else
                return true;
        }
        return false;
    }
}