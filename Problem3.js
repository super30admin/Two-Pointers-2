// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
 var searchMatrix = function(matrix, target) {
    let row = 0, col = matrix[0].length-1
    while(row <= matrix.length-1 && col >= 0) {
        if(matrix[row][col] == target) return true;
        else if (target > matrix[row][col]) row++;
        else col--;
    }
    return false;
};