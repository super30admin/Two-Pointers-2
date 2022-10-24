//TC: O(m+n)
//Sc: O(1)

//Approach: Take top-right as mid pointer for a sorted array and compare it with target and then move
// accordingly.


class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    int col = m-1;
    int row = 0;
    while(row < n) {

      if(col < 0)
        return false;

      if(matrix[row][col] == target) {
        return true;
      }
      else if(matrix[row][col] > target) {
        col--;
      }
      else {
        row++;
      }
    }
    return false;

  }
}