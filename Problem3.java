/**
 * Time complexity - O(m+n)
 * Space complexity - O(1)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Start with first row last column
        int i = 0;
        int j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target)
                return true;

            else if (i <= matrix.length && matrix[i][j] < target)
                i++;

            else
                j--;
        }
        return false;
    }
}