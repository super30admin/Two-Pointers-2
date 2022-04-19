//time-O(m+n)
//space-O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = m-1, col = 0;

        while(row<m && row>=0 && col<n && col>=0){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col] > target) row--;
            else col++;
        }

        return false;
    }
}