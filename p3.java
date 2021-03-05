//TC: O(m+n)
//SC: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 ) return false;
        int m = matrix.length; int n = matrix[0].length;
        int r = 0; int c = n-1;
        while(r<= m-1 && c>=0){
            if(matrix[r][c] == target)return true;
            else if(matrix[r][c] > target)c--;
            else r++;
        }
        return false;
    }
}