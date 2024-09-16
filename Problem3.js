// Merge sorted array (LC 240)
// Time Complexity : O(m x n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Go through matrix and keep decrementing row and incrementing column till you hit the target

// Your code here along with comments explaining your approach
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    if(matrix === null || matrix.length === 0){
        return false;
    }
    let m = matrix.length;
    let n = matrix[0].length;
    let r = m - 1;
    let c = 0;
    while(r >= 0 && c >= 0 && c < n && r < m){
        if(matrix[r][c] === target){
            return true;
        }
        if(matrix[r][c] > target){
            r--;
        } else{
            c++;
        }
    }
    return false;
};