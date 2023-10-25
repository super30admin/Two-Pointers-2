// Time Complexity : O(M + N) where M rows of matrix  & N is columns of matrix.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SearchIn2DMatrix
{
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target)
        {
            int rows = matrix.length, cols = matrix[0].length;
            int targetRow = 0, targetColumn = cols-1;

            while( targetRow < rows && targetColumn >= 0 )
            {
                if(matrix[targetRow][targetColumn] == target)
                    return true;
                else if (matrix[targetRow][targetColumn] > target)
                {
                    targetColumn--;
                }
                else
                    targetRow++;
            }
            return false;
        }
    }
}
