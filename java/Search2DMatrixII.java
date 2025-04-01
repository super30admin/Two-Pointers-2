package java;

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int r = 0, c = n - 1;

        while (r <= m - 1 && c >= 0) {
            if (target == matrix[r][c])
                return true;

            if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;

    }
}

//TC: O(m+n), SC: O(1)
