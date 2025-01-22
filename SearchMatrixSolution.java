class SearchMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (col >= 0 && row < m) {
            int val = matrix[row][col];
            if (target == val) {
                return true;
            } else if (target > val) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}