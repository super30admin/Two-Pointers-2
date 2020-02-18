// S30 Big N Problem #37 {Medium}
// 240. Search a 2D Matrix II
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
// Two solutions : starting from bottom left or top right element
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length==0) return false;
        
        int m=matrix.length;//row
        int n=matrix[0].length;//columns
        
        //bottom left element
        //int i=m-1;
        //int j=0;
        
        //top right element 
        int i=0;
        int j=n-1;
        
        //System.out.println(matrix[i][j]);
        
        //while(i>=0 && j<=n-1){
        while(j>=0 && i<=m-1){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target){
                i++;
                //j++;
            }else{
                j--;
                //i--;
            }
        }
        return false;
    }
}