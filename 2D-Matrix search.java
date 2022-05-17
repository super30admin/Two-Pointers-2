
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

//Taking the first row las column element as the start .
//If the element is greater than the target then move left other wise move down
//If we foiund the target return 0 else if the element crosses its boundaries and target not found then return false

// class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length,n=matrix.length;
        int i=0,j=m-1;
        while(j>=0 && i<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}