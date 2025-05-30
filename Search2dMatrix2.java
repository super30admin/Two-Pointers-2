public class Search2dMatrix2 {
    /**
     * as elements are sorted in each row and column at any position left and up will be smaller element
     * and right and down will be bigger element. Using this logic we can start at either top-right or bottom-left
     * to navigate towards the target eliminating one side.
     *
     * Time: O(m + n) Space: O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
