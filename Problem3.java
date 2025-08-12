/*Time Complexity:O(m+n)
Space Complexity:O(1)
Approach:We start searching from the top-right corner of the matrix: If the current value equals the target, return true. If the target is less than the current value, move left (decrease column). If the target is greater than the current value, move down (increase row).
*/
public class Problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {
    // Edge case: if matrix is null or empty, return false
      if(matrix==null || matrix.length==0)
      {
        return false;
      } 
      int m=matrix.length;//number of rows
      int n=matrix[0].length;//number of columns
      int row=0; // Start from the top row
      int col=n-1; // Start from the last column (top-right corner)
      // Loop until we move outside the matrix
      while(row<m && col>=0)
      {
        if(matrix[row][col]==target)
        {
            return true;// Found the target
        }
        else if(target<matrix[row][col])
        {
            col--; // Move left if target is smaller than current value
        }
        else{
            row++;// Move down if target is greater than current value
        }
      }
      return false;// Target not found in the matrix
    }
}