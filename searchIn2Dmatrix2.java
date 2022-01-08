// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
     /* we are starting row from 0 and  cloumn from the last position of 1st row & we can decide weather to move
        left or downwards. if the target is smaller than our current position then we should move towards left and if the target
        is greater than current postion value then we should move downwords in same column  */
   
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;  //length of row
        int n = matrix[0].length; // length of cloumn
        
        int i=0;   
         int j= n-1;
       
        while(i< m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else{
                if(target<matrix[i][j]){
                    j--;
                }else{
                    i++;
                }
            }
            
        }
        return false;
    }
}
