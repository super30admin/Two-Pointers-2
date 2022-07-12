// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int row = 0;
        int col = cols - 1;
        while(row<rows && col>=0){
            if(matrix[row][col]<target){
                row++;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}