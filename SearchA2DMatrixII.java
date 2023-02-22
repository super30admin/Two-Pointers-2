// TC: O(m + n)
// SC: O(1)
class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        if(mat == null || mat[0].length == 0) {
            return false;
        }
        int m, n, i, j;
        m = mat.length;
        n = mat[0].length;
        i = 0;
        j = n - 1;
        while(i < m && j >= 0) {
            if(mat[i][j] == t) {
                return true;
            } else if(mat[i][j] < t) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}