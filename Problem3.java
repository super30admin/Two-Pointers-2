//Problem 240 : Search a 2d matrix 2
//Solved successfully on leetcode and faced no issues
//Time complexity : O(m+n) Space complexity : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length; //no.of columns
        int m = matrix.length; //no.of rows
        int row = 0; 
        int col = n - 1;
        while(row < m && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
        
    }
}