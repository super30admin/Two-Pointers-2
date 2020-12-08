/** Write an efficient algorithm that searches for a target value in an m x n integer matrix. 
* Time complexity O(M+N). Space complexity O(1)
* Code submitted on leetcode
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while(i <= m-1 && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                j--;
            }
            else if (matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }
}
