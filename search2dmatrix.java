// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length==0)
            return false;
        
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int i=0,j=m-1;
        int[][] dir={{0,-1},{1,0}};
        
        while(i>=0 && i<n && j>=0 && j<m)
        {
            int curElement=matrix[i][j];
            if(curElement==target)
                return true;
            else if(curElement>target)
            {
                i+=dir[0][0];
                j+=dir[0][1];
            }
            else
            {
                i+=dir[1][0];
                j+=dir[1][1];
            }
        }
        
        return false;
    }
}