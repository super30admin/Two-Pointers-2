//https://leetcode.com/problems/search-a-2d-matrix-ii/
/*
Time: O(rows+cols)
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class SearchMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col])
                return true;

            else if (target > matrix[row][col])
                row++;

            else
                col--;
        }

        return false;
    }

}
