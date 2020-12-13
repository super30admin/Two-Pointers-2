// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Start two pointers i column wise and j for row wise for iterating matrix.
// if target sum is found then return true else if target > current value then search column or else search row.
class Search2DMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
            return false;
        int m = matrix.length;
        int n= matrix[0].length;
        int i=0, j=n-1;
        while(i<m && j>=0) {
            if(matrix[i][j] == target)
                return true;
            if(target > matrix[i][j])
            {
                i++;
            } else {
                j--;
            }
        }
    return false;
    }
}