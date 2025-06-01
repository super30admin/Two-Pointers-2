// ## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Did this code successfully run on Leetcode : YES

var searchMatrix = function(matrix, target) {
    //Time Complexity : O(M+N)
    //Space Complexity : O(1)
    let i = 0
    let j = matrix[0].length-1
    //Start with right corder becasue towards its left ele are small and to its bottom ele are big, y ou get your mid 
    while(i < matrix.length && j >= 0){
        if(matrix[i][j]==target){
            return true
        }
        else if(matrix[i][j]<target){
            i++
        }
        else{
            j--
        }   
    }
    return false
};