/*
 *  Time Complexity: O(M+N) In the worst case we check each element in the row and each element in column.
 *  Space Complexity: O(1) Since we do not use any additional space.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : Design the approach to hold the min element.
 *
 *  Explanation: We start our search from the last element in the first row. We return true if target is equal the value in the current index. If our target is smaller it would lie in the previous column, else it would lie in the next row. We return true if we find the element or return false if we go out of bounce. 
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int i=0, j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target==matrix[i][j]) return true;
            else if(target<matrix[i][j]) j--;
            else i++;
        }
        return false;
    }
}
