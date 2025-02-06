// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
           return false;
       }
       
       int rows = matrix.length;
       int cols = matrix[0].length;
       
       // Start from the top-right corner
       int row = 0, col = cols - 1;
       
       while (row < rows && col >= 0) {
           if (matrix[row][col] == target) {
               return true; // Found target
           } else if (matrix[row][col] > target) {
               col--; // Move left
           } else {
               row++; // Move down
           }
       }
       
       return false; 
       
   }
    
}
