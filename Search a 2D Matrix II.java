
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//start from top right corner, move bot if target>cur, else move back
//if cur==target return true else if goes out of bounds return false

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;
        
        int m = matrix.length, n = matrix[0].length;
        int i=0, j=n-1;
        
        while(i<m && j>=0){
            if(matrix[i][j]==target)
                return true;
            
            if(target>matrix[i][j])
                i++;
            else
                j--;
        }
        
        return false;
    }
}