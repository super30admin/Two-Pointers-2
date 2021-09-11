// Time Complexity : O(n+m) where n is the row of the matrix and m is the column of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: As the matrix is sorted in ascending from left to right in each row and each column are sorted in ascending from top to bottom. we can start from top right or bottom left  

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int iRow = row-1;
        int jCol = 0;
        
        while(jCol >= 0 && jCol <= col-1 && iRow >=0 && iRow <= row-1){
            if(matrix[iRow][jCol] == target){
                return true;
            }
            else if(matrix[iRow][jCol] > target){
                iRow--;
            }
            else{
                jCol++;
            }
        }
        
        return false;
    }
}