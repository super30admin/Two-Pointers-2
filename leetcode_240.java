// Time Complexity :O(m + n) where m is rows in the matrix and n is columns in the matrix
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0; int j = n-1;
        while(i<m && j>=0){
            //inc row or dec colmn
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}