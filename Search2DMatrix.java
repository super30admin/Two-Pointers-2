public class Search2DMatrix {
    /**
     * Time Complexity - O(m+n) where m is the len of the rows of the matrix and n is the len of the cols of the matrix
     * Space Complexity - O(1)
     * Algo - i/p matrix has sorted rows and sorted cols.
     *        start looping from the right most cell of the matrix[m-1][0], and check the row and col are within bounds
     *        check if the value in the cell is == target, if yes return true,
     *        else if target < matrix[r][c] (curr elem) then decrement the row, else increment col.
     *        If the looping is complete and we do not find the target then return false
     *
     * @param matrix
     * @param target
     * @return boolean
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m - 1;
        int c = 0;

        while (r >= 0 && c <= n - 1) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                r--;
            } else {
                c++;
            }
        }

        return false;

    }
}
