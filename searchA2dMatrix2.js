// Time Complexity : O(m + n): since we do not iterate the entire 2d array
// Space Complexity : O(1) - constant
// Did this code successfully run on Leetcode : Yes

var searchMatrix = function (matrix, target) {
  const m = matrix.length;
  const n = matrix[0].length - 1;
  let i = 0;
  let j = n;

  while (i < m && i >= 0 && j <= n && j >= 0) {
    // if target is found - return true
    if (matrix[i][j] === target) {
      return true;
    }

    // if target is greater than current
    if (matrix[i][j] < target) {
      i++;
    } else {
      j--;
    }
  }
  return false;
};

console.log(searchMatrix([[-5]], -10));
