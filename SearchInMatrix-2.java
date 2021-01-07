//Problem 37 : Search In Matrix-2
// Time Complexity : O(rows+cols),because either we are incerementing the row or decrementing the column 
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
  Brute force: Linear Search TC->(O(rows*cols))
  
  Optimized: Start from first row last column and if target is less than the current value, decrement col otherwise if target is greater than the current value increase the row counter.
*/
class Solution37 {
    public boolean searchMatrix(int[][] matrix, int target) {
     
        if(matrix==null || matrix.length==0){
            return false;
        }
        
        int i=0;
        int j=matrix[0].length-1;
        
        while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length){
            
            if(matrix[i][j]==target){
                return true;
            }else if(target>matrix[i][j]){
                i++;
            }else{//target<matrix[i][j]
                j--;
            }
            
        }
        
        return false;
    }
}