// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: we start from bottom left. If target is smaller than curr val, we decrement
// the row, else if target is greater than curr val, we know that our target might exist
// in the curr row, so we increment the col.

// LC- 240. Search a 2D Matrix II

public class SearchIn2DMatrix2 {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }

    int row = matrix.length - 1, col = 0;

    while (row >= 0 && col < matrix[0].length) {
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] > target) {
        row--;
      } else {
        col++;
      }
    }

    return false;
  }
}
