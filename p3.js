// ## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const searchMatrix = function(matrix, target) {
    if(!matrix || matrix.length === 0) return false;
    let m = matrix.length;
    let n = matrix[0].length;
    let r = 0; let c = n - 1;
    while(r < m && c >= 0){
        if(matrix[r][c] === target) return true;
        else if(matrix[r][c] > target) c--;
        else r++;
    }
    return false;
};