class Solution {
    /**
     * # Time complexity: O(m + n), where m is the number of rows and n is the number of columns.
     * # Space complexity: O(1), as no extra space is used.
     * # Leetcode: Yes
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = 0;
        int n = matrix[0].length - 1;

        while (m < matrix.length && n >= 0) {
            if (matrix[m][n] == target) {
                return true;
            } else if (target > matrix[m][n]) {
                m++;
            } else {
                n--;
            }
        }
        return false;
    }
}