// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: Start with either of the corners of the matrix where j-1 th element is decreasing and i+1 th element is increasing and
// This helps us make a decision in which direction to traverse the matrix.
// We start from top right corner, we check if that element is > target, we move to the previous column.
// If the element was < target, move to the same column next row. Finally, return true if we reach the target.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        
        // row                // col.
        int m=matrix.length; int n=matrix[0].length;
        
        // start from the top right corner
        int i=0; int j=n-1; //0th row last columnn
        
        while(j>=0 && i<m){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j] > target){ // move to smaller side i.e. prev column
                j--;
            } else {
                i++; // go to same col. next row i.e. larger side
            }
        }
        return false;
    }
}