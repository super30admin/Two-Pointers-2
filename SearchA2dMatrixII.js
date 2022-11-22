// Time Complexity : O (m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: The top-right/ bottom left column is chosen and travserse to find the target. if target is greater than current value, traverse in downward direction otherwise left.

/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
  if (matrix === null || matrix.length === 0) return false;

  var m = matrix.length;
  var n = matrix[0].length;

  var r = 0;
  var c = n - 1;

  while (r < m && c >= 0) {
    if (matrix[r][c] === target) {
      return true;
    } else {
      if (target > matrix[r][c]) {
        r++;
      } else {
        c--;
      }
    }
  }
  return false;
};
