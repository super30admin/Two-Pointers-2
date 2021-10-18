
// Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// start searching from the first row and last column..we will be moving either left or down..if the target is 
//smaller thn current element we will search in row by decreasing column index and moving left
//if is not we will go to next row by increasing row index thats going down..will continue doing this till we 
//get the target or reach last row frst column

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null){
            return true;
        }
        
        int m= matrix.length-1;
        int n=matrix[0].length-1;
        
        int cr=0, cl=n;
        
        while(cr<=m && cl>=0){
            if(target==matrix[cr][cl]){
                return true;
            }else if(target<matrix[cr][cl]){
                cl--;
                
            }else{
                cr++;
            }
        }
        return false;
    }
}