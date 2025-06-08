/*
Two Pointers
Time Complexity : O(m + n) where m is the number of rows and n is the number of columns in the matrix
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Intuition: It's a sorted matrix, so we can use a two-pointer approach starting from the top-right corner.
*/

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (col >= 0 && row <= matrix.length - 1) {
            if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SearchA2DMatrixII solution = new SearchA2DMatrixII();
        int[][] matrix = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }
        };
        int target = 5;
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println("Target found: " + result); // Output: Target found: true
    }
}
