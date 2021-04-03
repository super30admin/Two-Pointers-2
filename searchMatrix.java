/*
Run Time complexity - O(M+N)
Space complexity - O(1) - no extra space is used for this approach
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)
            return false;
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]<target) // Go towards the greater elements side
                col++;
            else if(matrix[row][col]>target) // Go towards the smaller elements side
                row--;
            else
                return true;
        }
        return false;
    }
}
