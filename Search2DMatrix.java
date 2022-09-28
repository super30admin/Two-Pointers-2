// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // base caes
        if (matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        // starting in first row and last column
        int r = 0, c = n-1;

        while (r <m && c>=0) {
            if(matrix[r][c] < target) r++;
            else if (matrix[r][c] > target) c--;
            else return true;
        }
        return false;
    }
}