// Time Complexity : O(m + n); m = matrix.length; n = matrix[0].length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    private boolean inBounds(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >=0 && y < n;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[m-1][n-1]) {
            return false;
        }

        int curr = 0;
        int i = 0;
        int j = n - 1;

        while(inBounds(i, j, m, n)) {
            curr = matrix[i][j];
            if(target == curr) {
                return true;
            }
            else if(target > curr) {
                // move down
                i += 1;
            } else {
                // move left
                j -= 1;
            }
        }

        return false;
    }
}