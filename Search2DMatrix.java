// https://leetcode.com/problems/search-a-2d-matrix-ii/
// Time complexity : O(m+n) where m is number of rows and n is number of columns
// Space complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col-1;
        while(i<=row-1 && j>=0){
           if(matrix[i][j]==target) return true;
           else if(matrix[i][j]>target){
              j--;
           }else{
              i++;
           }
        }
        return false;
    }
}