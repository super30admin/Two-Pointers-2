/*240. Search a 2D Matrix II
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Constraints:
m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109
 */
/*Time Complexity:O(m+n)
Space Complexity:O(1)
Approach:We start searching from the top-right corner of the matrix:
If the current value equals the target, return true.
If the target is less than the current value, move left (decrease column).
If the target is greater than the current value, move down (increase row).
This works because each row is sorted left to right, and each column is sorted top to bottom.*/
public class 2DMatrixSearch {
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
