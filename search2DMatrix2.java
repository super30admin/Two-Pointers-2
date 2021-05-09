//Time Complexity : O(n)
//Space Complexity : O(1). 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0){return false;}
        
        int r = matrix.length;
        int c = matrix[0].length;
        int i = 0;
        int j = c - 1;
        
        
       while(i < r && j < c && i > -1 && j > -1){
           
              if(target > matrix[i][j]){
            
            i ++;
        }
        
        else if(target < matrix[i][j]){
            
            j --;
        }
        
         else if(target == matrix[i][j]){
            
          return true;
        }
           
           
       }
     
        return false;
        
    }
}