// Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

// Time Complexity : O(m+n) where m is rows and n is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Start from top right element
// If target is less than number at location, move down as the answer will be larger
// Else move left

// Your code here along with comments explaining your approach

/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
    if (matrix === null || matrix.length === 0) {
        return false;
    }
    // Start from top right element
    // If target is less than number at location, move down as the answer will be larger
    // Else move left
    let i = 0;
    let j = matrix[0].length - 1;
    while (i < matrix.length && j >= 0) {
        if (matrix[i][j] === target) {
            return true;
        } else if (matrix[i][j] < target) {
            // Go down
            i++;
        } else {
            // Go left
            j--;
        }
    }
    return false;
};