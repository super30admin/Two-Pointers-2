/*Time ComplexityO(M+N) where m is the number of rows and n is the number of columns
Space Complexity Since it is in place O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length-1;
        int c = 0;

        while (r >= 0 && c < matrix[0].length) {
            if (matrix[r][c] > target) {
                r--;
            } else if (matrix[r][c] < target) {
                c++;
            } else { 
                return true;
            }
        }

        return false;
    }
}