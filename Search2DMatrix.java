package TwoPointers2;

/*
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