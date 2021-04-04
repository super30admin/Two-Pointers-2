// Logic - Search Space Reduction - Starting from Left Bottom
//Space complexity - O(1)
//Time complexity - O(n + m)
//      where n - number of rows in matrix
//            m - number of columns in matrix

class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {

    if(matrix == null || matrix.length == 0) { return false; }

    int r=matrix.length-1, c=0;


    while(c < matrix[0].length && r >= 0 ){

      if(matrix[r][c] == target){
        return true;
      }
      else if(matrix[r][c] < target){
        c++;
      }else{
        r--;
      }


    }

    return false;
  }
}