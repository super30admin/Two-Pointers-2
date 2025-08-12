// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1) Start at bottom-left cell (r = m-1, c = 0).
// 2) If current > target move up; if current < target move right.
// 3) If equal return true; stop when out of bounds => false.


public class SearchIn2dMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m - 1, c = 0;

        while(r >= 0 && c < n){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) r--;
            else c++;
        }

        return false;
    }
}
