
//SC O(1)
//TC O(m+n)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           if (matrix==null||matrix.length<1||matrix[0].length<1)
            return false;
        int col = matrix[0].length-1;
        int row=0;
        while (row<matrix.length&&col>=0){
            if (matrix[row][col]==target)
                return true;
            else if (matrix[row][col]>target)
                col--;
            else 
                row++;
        }
        return false;
    }
}