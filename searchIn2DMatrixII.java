
// Time Complexity : o(m + n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yess
// Three line explanation of solution in plain english
// simple problem actually; can be done on observation; we can start on m-1,0 index or 0,n-1 index 
// we know deterministically that elemets in particular direction behave in a certain way
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int i = m - 1;
        int j = 0;
        while(i >= 0 && j < n) {
            if(matrix[i][j] == target) {
                return true;
            }
            if(matrix[i][j] > target) {
                i--;
            }
            else {
                j++;
            }
        }
        return false;
    }
}