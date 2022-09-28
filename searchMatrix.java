class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        int i=0;
        int j=n-1;
        
        while(i<m && j>=0)
        {
            if(target<matrix[i][j])
                j--;
            else if(target>matrix[i][j])
                i++;
            else return true;
        }
        
        return false;
    }
}

// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no