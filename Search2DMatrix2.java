// ## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Start from either topright or bottom-left corner since we have only one decision to make in both these cases. Reduce the search space by moving in the direction of the target.

public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;

        // Start from the top-right element
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];
            if (target == current) {
                return true; // Target found
            } else if (target < current) {
                col--; // Move left in the current row
            } else {
                row++; // Move down to the next row
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] input = new int[][] {
                { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        Search2DMatrix2 obj = new Search2DMatrix2();
        System.out.println("Element found " + obj.searchMatrix(input, 23));

    }
}
