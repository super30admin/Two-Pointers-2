// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/* Start from either top right or bottom left corner and traverse till end of the other side.
 * we keep discarding the parts of the matrix which is greater than the target in each iteration.
 * if the colum has the target in its range then we search over the rows.
 */

public class Search2DMatrix  {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            }else{
                j--;
            }
        }

        return false;

    }
}