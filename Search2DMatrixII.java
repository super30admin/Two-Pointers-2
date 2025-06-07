
// Time Complexity: O(m + n), where m = number of rows, n = number of columns
// Space Complexity: O(1), constant space usage

public class Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        // Start from the top-right corner of the matrix
        int col = matrix[0].length - 1; // last column
        int row = 0; // first row

        while (col >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][col]) {
                // Found the target
                return true;
            } else if (target < matrix[row][col]) {
                // Move left if target is smaller
                col--;
            } else {
                // Move down if target is larger
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Search2DMatrixII sol = new Search2DMatrixII();

        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 5;
        boolean result = sol.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);

        target = 15;
        result = sol.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
}
