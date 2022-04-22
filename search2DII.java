//Time Complexity : O(m+n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //base case
        if(matrix==null ||matrix.length==0)
            return false; 
        //length of rows and cols
        int m=matrix.length;
        int n=matrix[0].length;
        int i=m-1, j=0;//row for smaller, col for greater
        //lower left 
        while(i>=0 && j<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(target> matrix[i][j]){
                //then move to right to find greater value
                j++;
            }
            //when the target is smaller than the present value
            else{
                i--;
            }
        }
        return false;
    }
}