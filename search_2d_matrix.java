// Time Complexity : O(m+n) m-row n-column
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
/* As the array is has sorted rows and columns, left most value in last row and right most value in first row will have values lesser than it in one direction 
and greater than it in other direction. Using this logic we can compare each element with target and move left or right based on that */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0)
            return false;
        
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
                col--;
            else
                row++;
        }
        return false;
    }
}