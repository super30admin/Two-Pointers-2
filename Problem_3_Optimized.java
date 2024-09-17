// Time complexity - O(m+n)
// Sapce complexity - O(1)

// Start with matrix[n-1][0]. Decrease row if matrix element is greater else increase column.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int n = matrix.length; int m = matrix[0].length;
        int r = n-1; int c = 0;
        while(r >= 0 && c < m){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] > target){
                r--;
            }else{
                c++;
            }
        }
        return false;
    }
}
