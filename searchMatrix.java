
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
/*Approach- We are pointing to the topmost right element so setting i,j values accordingly, from there we are checking if the matrix element is
equal to target or if greater than target it will be present in the below rows of the column (ie,traverse bottom)else if it is less than the target
you will find that value to the left (traverse left in the same row )so, similarly at every cell we will make a decision to move in either of the
direction based on the element value in comparison to the target value.*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)
            return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=n-1;
        while(j>=0&&i<m){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target)
                i++;
            else
                j--;
        }
        return false;
    }
}