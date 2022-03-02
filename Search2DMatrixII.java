// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Start from top right corner and check if element is equal to target if yes then return true.If not check if element is
// less than target if yes then move down, if element is greater than target if yes then move left. If we run out of 
// elements then return false.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length){
            if(matrix[i][j]==target){
                return true;
            }
            else{
                if(matrix[i][j]>target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
}