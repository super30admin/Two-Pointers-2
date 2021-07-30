// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//We start from left top and move left or down based on the target and the element at the matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0;
        int j = matrix[0].length-1;
        
        while (i<matrix.length && j>=0){
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}