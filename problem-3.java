// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Since each row and column is sorted we have two starting points from which we will be able to make crisp decisions (top-right and botton-left) and two points from where we will be able to make fuzzy decisions(top-left and botton-right).
        int i=0, j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false; 
    }
}
