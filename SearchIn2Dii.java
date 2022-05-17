// Time Complexity :O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;//start from top left
        int col = matrix[0].length-1;//start from top right
        //since the matrix is sorted we can check ascending and descending at same time
        //so forwards if target is larger or backwards if smaller
        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<=target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}