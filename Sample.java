// Time Complexity : O(n3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes (brute force solution)
// going through the all elements we check for the target

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
