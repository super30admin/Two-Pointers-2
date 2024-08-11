// Time Complexity : O(n+m)
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I used the same logic Jaspinder explained. 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = m - 1;
        int c = 0;

        while(r >= 0 && c < n){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] < target){
                c++;
            }else{
                r--;
            }
        }
        return false;
    }
}