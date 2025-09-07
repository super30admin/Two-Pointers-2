class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //no of rows
        int n = matrix[0].length; // no. of cols
        int r = m - 1;
        int c = 0;

        while (r >= 0 && c < n) {
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] < target) {
                c++;
            } else {
                r--;
            }
        }
        return false;
    }
}