/**
 * Searches for a target value in a 2D matrix with the following properties:
 * - Each row is sorted in ascending order from left to right.
 * - Each column is sorted in ascending order from top to bottom.
 *
 * Approach:
 * - Start from the top-right corner of the matrix.
 * - If the current value equals the target, return true.
 * - If the current value is less than the target, move down to the next row.
 * - If the current value is greater than the target, move left to the previous
 * column.
 * - Repeat until either the target is found or indices go out of bounds.
 *
 * Time Complexity: O(m + n)
 * - m = number of rows, n = number of columns.
 * - In the worst case, the algorithm scans m rows and n columns.
 *
 * Space Complexity: O(1)
 * - No additional space is used apart from loop variables.
 */

public class search_2d_matrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n - 1;
        while (r < m && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
        int[][] matrix_1 = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target_1 = 20;
        System.out.println(searchMatrix(matrix_1, target_1));
    }
}
