// Time Complexity: O(m+n)
// Space Complexity: O(1)
//240. Search a 2D Matrix II - Medium
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
            return false;
        int m=matrix.length, n=matrix[0].length;
        // we  can start from either top-rt corner  (or) from bottom-left corner. This is because , say we are at bottom-ft cell, and we know our target is < the element in the bottom-left cell, we can gaurantee that we can reach target by moving up. lly, if the target> bottom-left cell=> then we can gaurantee that we can reach target by moving right. 
        //But this logic can not work for top-left and bottom-right, beacuse of the wasy they are sorted .( ie sorted in asc row wise and col wise)
        int i=m-1, j=0;
        while(i>=0 && i<m && j>=0 && j<n)
        {
            if(target==matrix[i][j])
                return true;
            else if( target> matrix[i][j])
            {
                j++;
            }
            else
            {
                i--;
            }
        }
        return false;
    }
}