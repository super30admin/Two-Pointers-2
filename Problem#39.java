// SEARCH A 2D MATRIX II

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Start with the top right element because one side is smaller and the other is bigger, so if the target is smaller than the element at the top right, move left, else move downwards. Repeat until the element is found or until all the elements in the matrix have been traversed.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0;
        int j = cols - 1;

        while(i < rows && j >= 0){
            if(matrix[i][j] == target)
                return true;
            if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
}