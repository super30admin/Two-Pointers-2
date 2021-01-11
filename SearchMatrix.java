// Time Complexity : 0(m+n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length < 1 || matrix[0].length<1)
            return false;

        int row = 0;
        int col = matrix[0].length -1;

        while(col>=0 && row<=matrix.length -1){
            if(target == matrix[row][col])
                return true;
            else if(target<matrix[row][col])
                col--;
            else if(target>matrix[row][col])
                row++;
        }

        return false;
    }
}