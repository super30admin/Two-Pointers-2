// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // check for null or empty array
        if(matrix == null || matrix.length == 0) return false;
        // intialize co-ordinates to the top right corner element of matrix
        int i = 0; int j = matrix[0].length - 1;
        // iterate through the matrix
        while(i>= 0 && j>=0 && i<matrix.length && j < matrix[0].length){
            // if target element is found then return true
            if(target == matrix[i][j]) return true;
            // eliminate right most column if the tagret is lesser than the element at the co-ordinates
            else if(target < matrix[i][j]) j--;
            // eliminare top most tow if the target is greater than the element at the co-ordinates
            else i++;
        }
        // return false if target element is not found in the matrix
        return false;
    }
}