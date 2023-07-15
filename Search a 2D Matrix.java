
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We need to start from the top right corner of the matrix or from the bottom left corner of the matrix, 
//because the elements next to them are either greater or smaller than them. If we start from top left or bottom right we wouldn't be able to move ahead from there. 
//When we start from the top right corner, we compare it with the target. If it is smaller than the target, then we need to move down, so we increment the column by 1, otherwise we move towards left and decrement the row by 1.
//We keep doing this until the target is met.
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m=matrix.length, n=matrix[0].length;
        int i=0,j=n-1; //Top right corner

        while(i<m && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            if(matrix[i][j]<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
        return false;
    }
}