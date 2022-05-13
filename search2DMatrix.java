
// Time Complexity :O(m+n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes

//we'll start from top right corner, if target is smaller we'll move left else we'll move down as 
//rows and columns are sorted
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int r = 0;
        int c = col - 1;
        while (true) {
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
            if (r >= row || c < 0) {
                break;
            }
        }
        return false;
    }
}