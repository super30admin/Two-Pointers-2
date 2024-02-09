//## ## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

// Time Complexity : O(M+N), where M X N is the size of input matrix
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

    // Start from top-right position and use sorted properties to move
    // down or left to find the target

// Your code here along with comments explaining your approach

class Solution {

    // Time - O(M*N) and Space - O(1)
    private boolean helper(int[][] matrix, int target){
        int i=0, j=matrix[0].length-1;

        while(j>=0 && i<matrix.length){
            if(matrix[i][j]==target){
                // Target found
                return true;
            }else if(target<matrix[i][j]){
                // Move left
                j--;
            }else if(target>matrix[i][j]){
                // Move down
                i++;
            }
        }

        // Element not found
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        return helper(matrix, target);
    }
}