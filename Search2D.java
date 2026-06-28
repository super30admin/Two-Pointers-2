public class Search2D {
    public boolean searchMatrix(int[][] m, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols-1;
        while ((row>=0 && row<rows) && (col>=0 && col<cols)) {
            if (target == matrix[row][col]) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}

