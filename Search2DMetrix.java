/**
 * Start at top right corner of metrics as it's easy to go both direction in case target is low/high.
 * Time: O(m+n)
 * Space:O(1)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // edge
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n -1;

        while( j >=0 && i < m){
            //case 1
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}