//Time Complexity = O(m+n)
//Space Complexity = O(1)
// Did this code successfully run on Leetcode: Yes
// Three line explanation of solution in plain english
// Logic: Here we are starting from the 0th row and last colomn, because we can deterministically move left or below based on if the target is either less than or greater than the value at that location.
// We check for the target while its within the boundaries of matrix i.e., j>=0 and i<=m-1
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m=matrix.length, n=matrix[0].length;
        int i = 0, j = n-1; // i = row, j = colomn
        while (j>=0 && i<=m-1) {
            if (target == matrix[i][j]) {
                return true;
            }
            else if (target > matrix[i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}