// Time Complexity : O(m + n) where m is number of rows and n is number of columns
// Space Complexity : O(1) since we are only using pointers
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :
// Start search from the bottom-left corner of the matrix.
// If the current number is greater than target, move up; if smaller, move right.
// This works because rows and columns are sorted in ascending order.

class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m - 1, c = 0; // start from bottom-left
        while (r >= 0 && c < n) {
            if (matrix[r][c] == target) {
                return true; // found target
            }
            if (matrix[r][c] > target) {
                r--; // move up
            } else {
                c++; // move right
            }
        }
        return false; // not found
    }
}
