// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    if(matrix == null || matrix.length == 0) return false
    let m = matrix.length;
    let n = matrix[0].length;
    let i = 0, j = n - 1;
    
    while(i < m && j >= 0){
        if(matrix[i][j] == target) return true;
        else if(matrix[i][j] > target){
            j--
        }
        else {
            i++
        }
    }
     return false
};