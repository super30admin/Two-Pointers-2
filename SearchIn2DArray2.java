// TC: O(m + n)
// SC: O(1)
class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if(mat == null || mat.length == 0) {
            return false;
        }
        //Starting from top right corner
        int m, n, i, j;
        m = mat.length;
        n = mat[0].length;
        i = 0;
        j = n - 1;
        while(i < m && j >= 0) {
            if(mat[i][j] == target) {
                return true;
            } else if(mat[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}