// Time Complexity : O(m*n) where m*n is matrix size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// implemeneted the solution with steps solution method. Start comparing the right top value of matrix with traget.
// move to the left till the value is greater than the target, otherwise move down and repeat this till whole matrix is traversed. 

/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let m = matrix.length;
    let n = matrix[0].length;
    let i = 0, j = n - 1; // i=0, j=4
    while(i < m && j >= 0) { // 0<5, 4>=0
        if(matrix[i][j] === target) return true;
        else if(matrix[i][j] > target) j--;
        else i++;
    }
    return false;
};