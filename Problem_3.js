
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// To search in a matrix where rows are seperately sorted and cols are separately sorted in a logical increasing order, 
// we know the last cell of the row has the bounds for the row 
// and each cell towards the 0th row or col is decreasing in value, 
// so we find the bound the target falls into and traverse the cols/ rows post finding the bound. 
// Your code here along with comments explaining your approach
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    //Initialize i to be the first row and j to be the last col
    let i = 0;
    let j = matrix[0].length - 1;
    // We iterate from the last cell of first row and increase the rows if target is more than the cell or decrease 
    // the cols if target is greater than the cell till we run out of the matrix bounds.
    while(i< matrix.length && j>=0){
        if(matrix[i][j] === target)
            return true;
        else if(matrix[i][j] < target)
            i++;
        else
            j--;
    }

    return false; 
};