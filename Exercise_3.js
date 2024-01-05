// Time Complexity : O(m + n)
// Space Complexity : O(1)

// search 2d matrix
var searchMatrix = function (matrix, target) {
    let m = matrix.length;
    let n = matrix[0].length;
    let i = 0;
    let j = n - 1;

    while (i < m && j >= 0) {
        if (matrix[i][j] === target) {
            return true;
        }
        if (matrix[i][j] < target) {
            i += 1;
        } else {
            j -= 1;
        }
    }
    return false;
}