class Solution {
    // Brute Force Approach: Linear Search
    // Time Complexity: O(m*n) where m is number of rows and n is number of columns
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null|| matrix.length==0)
        {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
