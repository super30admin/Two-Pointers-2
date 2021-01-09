// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1;
        int j = 0;
        while(i >= 0 && j < n ){
            if(matrix[i][j] == target) 
                return true;
            if(matrix[i][j]  > target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}