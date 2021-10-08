// Time Complexity :O(n+m) // n & m- row and col
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :Yes





class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        
        int r=matrix.length;
        int c=matrix[0].length;
        
        int i=0;
        int j=c-1;
        
        while(i<r && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        
        return false;
        
        
        
    }
}