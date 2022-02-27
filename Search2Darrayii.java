
// Time Complexity :O(m+n) m=number of rows n=col
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
//consider the left bottom or upper right element as mid element of array in that particular row and columns and then based on that reduce columns or rows

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length , n=matrix[0].length;
        int i=0,j=n-1;
        
        while(j>=0&&i<m){
            
            
            if(matrix[i][j]<target){
                ++i;
            }else if(matrix[i][j]>target){
                --j;
            }else{
                
                return true;
            }
        }
       return false; 
    }
}