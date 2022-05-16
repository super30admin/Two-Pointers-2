// Time Complexity : O(M +N)
// Space Complexity : O(M+N)
// Did this code successfully run on Leetcode : yes


/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
  
    let row = matrix.length;
    let col = matrix[0].length-1;
    let i=0;
    while(i<row && col>=0)
    {
        if(matrix[i][col]===target)
        {
            return true;
        }
        else if(matrix[i][col]>target)
        {
            col--;
        }else
        {
            i++;
        }
    }
    return false;
    
     
};