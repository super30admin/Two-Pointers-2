package TwoPointers2;

/*S30 Big N Problem #38 {Medium} - 
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:
Consider the following matrix:
[[1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]]
Given target = 5, return true.

Given target = 20, return false.

Source Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
    -------------------------------------------------------------------------------------------------------
    Time complexity : o(m+n) 
    space complexity: o(1) 
    Did this code run successfully in leetcode : yes
    problems faces : no
    */
    
public class Search2DMatrix {
    
public boolean searchMatrix(int[][] matrix, int target) {
        
  // start search from top right  
    if(matrix == null || matrix.length == 0) return false;
    
      int i=0;
      int j=matrix[0].length-1;
      
      while(i<matrix.length && j>=0)
      {
          if(matrix[i][j] == target)
          {
              return true;
          }else if(matrix[i][j] < target)
          {
              i++;
          }else
          {
              j--;
          }
      } 
      
      
    
    return false;
    }

//another way to start search from bottom left
public boolean searchMatrixFromBottom(int[][] matrix, int target) {
    
    if(matrix == null || matrix.length == 0) return false;
    
      int i=matrix.length-1;
      int j=0;
      
      while(i>=0 && j<matrix[0].length)
      {
          if(matrix[i][j] == target)
          {
              return true;
          }else if(matrix[i][j] < target)
          {
              j++;
          }else
          {
              i--;
          }
      } 
      
      
    
    return false;
    }

}
