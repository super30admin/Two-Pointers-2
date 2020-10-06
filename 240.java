/**
if m[r][c] == target 
    return true
else if(m[r][c] > target)
    c--
else r++

if row or column go out of bound, exit.

TC: O(m+n)
SC: O(1) constant space
**/

//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //blind line
        if(matrix == null || matrix.length == 0) return false;
        
        int m =matrix.length;
        int n = matrix[0].length;
        
        int r=0, c=n-1;
        
        while(r < m && c >=0){
            //base case
            if(matrix[r][c] == target) 
                return true;
            //search space reduction
            else if(matrix[r][c] > target) 
                c--;
            else r++;
            
        }
        return false;
        
    }
}