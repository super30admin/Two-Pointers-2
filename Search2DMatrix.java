/**
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 *
 * Time Complexity: O(m+n), where m is rows and n is columns
 * Space Complexity: O(1)
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 * 1. Start from either top right or bottom left corner because
 * both of these will have their neighbors either larger or smaller than current.
 * 2. Travel in the direction where target could possibly be using the 2 pointers approach.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;

        int row = 0;
        int column = columns;

        while (row <= rows && column >= 0) {
            if (target == matrix[row][column])
                return true;
            else if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix obj = new Search2DMatrix();
        int[][] matrix = {
                {1,3,4,6,19},
                {2,5,6,8,20},
                {5,7,8,9,22},
                {9,11,13,15,24},
        };
        boolean result = obj.searchMatrix(matrix, 18);
        System.out.println(result);
    }
}
