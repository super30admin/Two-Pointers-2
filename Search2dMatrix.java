// Time: O(m + n); m = matrix.length and n = matrix[0].length
// Space: O(1)
/**
 * Start at either [0, n - 1] or [m - 1, 0] where they have one smaller neighbor and one larger neighbor.
 * If target is smaller than current element then move to the smaller neighbor's index
 * else move to the larger neighbor's index.
 * Stop when the element is found and return true.
 * If indices go out of bounds return false.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int column = 0;
        while (row >= 0 && column < matrix[0].length) {
            System.out.println("matrix[row][column] = " + matrix[row][column]);
            if (matrix[row][column] == target) {
                return true;
            }
            if (target > matrix[row][column]) {
                // move right
                column ++;
            } else {
                // move up
                row --;
            }
        }
        return false; // target does not exist in the matrix
    }
}