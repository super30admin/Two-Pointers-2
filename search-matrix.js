// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english Start at the bottom left of the matrix.  If the current number is greater than the target, move up a row.  If the current number is less than the target, move right along the column.  If you miss the number it's not there.

/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    if (matrix == null || matrix.length == 0) return false;

    let row = matrix.length - 1,
        col = 0;

    while (row >= 0 && col < matrix[0].length) {
        if (matrix[row][col] > target) {
            row--;
        } else if (matrix[row][col] < target) {
            col++;
        } else {
            return true;
        }
    }
    return false;
};
