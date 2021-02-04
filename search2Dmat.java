// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     
        if(matrix==null||matrix.length==0||matrix[0].length==0){return false;}
        
        int n=matrix.length, m=matrix[0].length, i=0, j=m-1;
        
        while(i<n && j>=0){
            if(matrix[i][j]==target){
                return true;}
            else if(matrix[i][j]<target){i+=1;}
                else{j-=1;}}
        
        return false;
    }
}