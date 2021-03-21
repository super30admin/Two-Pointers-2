/*
TC: O(m+n)
SC: O(1) Const
Leetcode: Success!
Problems: Python version of matrix is hard to trace!
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Sanity Check 
        if(matrix==null || matrix[0].length == 0){
            return false;
        }
        // Initialize all the variables for the pointers row and column
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Initialize the row and column pointers to accordingly, in case we are starting from the bottom
        int r = m-1; int c = 0;
        
        // Check points
        while(r>=0 && c<=n-1){
            // if the value at pointers == target return true
            if(matrix[r][c]==target) return true;
            // Check for whehter the value at pointers is greater or less than the target and increament the pointers accordingly
            if(matrix[r][c] > target){
                r--;
            }else{
                c++;
            }
        }
        // in case there is no match return false
        return false;
    }
}
