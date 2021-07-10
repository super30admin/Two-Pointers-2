
// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Row and column poinyers

// Your code here along with comments explaining your approach
// I already did this proeblem on leetcopde
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge case
        if(matrix == null || matrix.length==0) return false;
        int i = matrix.length-1,j = 0; // row and column pointer
        while(i>=0 && j <matrix[0].length)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]<target)
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