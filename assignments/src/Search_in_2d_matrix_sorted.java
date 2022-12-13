public class Search_in_2d_matrix_sorted {

    // Time: O(m + n), Space: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {

        // // Start from bottom left or top right (bottom left here)
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            }
            else if (matrix[row][col] < target) {
                col++;
            }
            else return true;
        }
        return false;
    }
}