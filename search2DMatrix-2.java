//start from top right corner, if <target, r++, else c--
//Time complexity: O(m+n)
//Space complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r =0; int c= n-1;
        while(r<m && c>=0) {
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) {
                r++;
            } else c--;
        }
        return false;
    }
}