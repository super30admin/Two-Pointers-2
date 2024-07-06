// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    // Starting from the last element on the first row.
    int row = 0;
    int column = matrix[0].length-1;
    while(row<matrix.length && column>=0) {
      if(matrix[row][column] == target) return true;
      // If element is lesser than target then move down to next row.
      else if(matrix[row][column] < target) {
        row++;
        // If element is more than the target then move to previous column.
      }else {
        column--;
      }
    }
    return false;
  }
}