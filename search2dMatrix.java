//time O(m+n) where m is the no of rows and n is the no of columns
//space O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1 && matrix[0].length == 1) return target == matrix[0][0];
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n -1;
        while (r >= 0 && c >= 0 && r <= m -1 && c <= n -1) {
            if (matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c] < target) {
                r++;
            } else if(matrix[r][c] > target) {
                c--;
            }
        }
        return false;
    }
}
