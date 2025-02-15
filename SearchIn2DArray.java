// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0 ; 
        int j= n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}