
// Time Complexity : O(m+n) m - number of rows , n - number of columns
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int row = 0;
     int col = matrix[0].length-1;
        
     while(row<matrix.length && col>-1)
     {
         if(matrix[row][col]==target)
         {
             return true;
         }else if(matrix[row][col]>target)
         {
             col--;
         }else
         {
             row++;
         }
     }
        
        return false;
    }
}