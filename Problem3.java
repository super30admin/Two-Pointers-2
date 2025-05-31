//Problem: Search a 2D Matrix II
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0 , c = n-1;

        while(r < m && c >=0){
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}