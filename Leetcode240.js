/**
// Time Complexity : O(M +N)
// Space Complexity : O(M+N)
// Did this code successfully run on Leetcode : yes
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let r=matrix.length,c=matrix[0].length-1;
    let i=0;
    while(i<r && c>=0){
        if(matrix[i][c]===target){
            return true;
        }
        else if(matrix[i][c]>target){
            c--;
        }else{
            i++;
        }
        
    }
    return false;
};