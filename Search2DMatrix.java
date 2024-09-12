
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix.length == 0 || matrix[0].length==0){
            return false;
	   }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = m-1;
        int j = 0;
        
        while(i>=0 && j<n){
            if(target<matrix[i][j]){
                i--;
            }else if(target>matrix[i][j]){
                j++;
            }else{
                return true;
            }
        }
        
        return false;
    }
}