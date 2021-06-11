
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      //edge case
      if(matrix == null || matrix.length == 0) return false;
   
      int m = matrix.length ;
      int n  = matrix[0].length;
      //pointers at top right corner
      int i = 0;
      int j = n-1;
      
      while(i < m && j >= 0) {
        if(matrix[i][j] == target) return true; // value at ptr = target
        else if(matrix[i][j] < target) { // smaller than target increase row
          i++; 
        } else { // decrease col
          j--;
        }
      }
       return false; 
    }
}