//Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Accepted in Leetcode
//TC is O(m+n)and SC is O(m*n)

/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {

    if(matrix == null) return false;
    let m = matrix.length;
    let n = matrix[0].length;

    let r=0; let c=n-1;

    while(r<m && c >=0){
        if(matrix[r][c] == target) return true;
        else if(matrix[r][c] > target) c--
        else r++
    }

    return false

    
};