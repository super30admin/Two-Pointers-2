// Time Complexity :O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // edge case
        if( matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        
        int i =0 ; int j= matrix[0].length-1;
        
        // loop wjile i && j are in boundary
        while(i<=matrix.length-1 && j>=0){
            
            if(target == matrix[i][j]){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }
            
            return false;
        
    }}