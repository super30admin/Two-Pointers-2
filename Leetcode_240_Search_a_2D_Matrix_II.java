/*
B-F - linear search
tc: O(mn)
sc:O(1)
*/
/*
based on the ascending orders given on row and column, start iterating from the top right orner
if target is lesser - go to the left col
f target is igger, go down on rows
tc: log(mn)
sc: O(1)*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // base case
        if (matrix == null)
            return false;

        int row = matrix.length;
        int col = matrix[0].length;

        // We'll start from the top right corner
        int r = 0, c = col - 1;

        while (r <= row - 1 && c >= 0) {
            if (matrix[r][c] == target)
                return true;

            else if (matrix[r][c] > target) {
                c--; // go left
            } else {
                r++; // go down in rows
            }
        }
        return false;
    }
}