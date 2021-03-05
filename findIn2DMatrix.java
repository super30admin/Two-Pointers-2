
// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// In this approach we start from the right most top element and check if the element is greater than the current element or less than the current
// element. If the element is greater than the current element we move down in the matrix but if it is less than the current element we move to the 
// left direction in the matrix.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
      if(matrix== null || matrix.length==0)
      {
        return false;
      }
      
      int r = 0;
      int c =0;
      int m = matrix.length;
      int n = matrix[0].length;
      
      while(r<=m-1 && c>=0)
      {
        if(matrix[r][c]==target)
        {
          return true;
        }
        //move to the left direction
        if(matrix[r][c]>target)
        {
          c--;
        }
        //move to the down direction
        else
        {
          r++;
        }
      }
       
        return false;
    }
}