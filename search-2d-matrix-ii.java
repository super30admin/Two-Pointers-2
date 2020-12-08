// Time - O(m+n)
// Space - O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        
        while(i < m && j >= 0) {
            int mid = matrix[i][j];
            
            if(mid == target) {
                return true;
            }
            else if(mid > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
