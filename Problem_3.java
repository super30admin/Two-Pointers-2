/*

Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

Time Complexity : O(m+n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(col >= 0 && row < m){
            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }

        return false;
    }
}