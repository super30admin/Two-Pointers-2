
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while(i< m && j>= 0){
            if(matrix[i][j] == target){
                return true;
            }
            //if target is greater than we will iterate down that is increment the row
            else if(target > matrix[i][j]){
                i++;
            }
            //if target is smaller than we will iterate decrement the column
            else{
                j--;
            }
        }
        return false;
    }
}