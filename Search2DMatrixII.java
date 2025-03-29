// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// Check the first element of last row for target, if equal return true.
// If the element is less than target, move along column towards for next element.
// If the element is greater than the target, move upwards in the column.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=m-1,j=0;
        while(i>=0 && j<=n-1){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target){
                j++;
            }
            else{
                i--;
            }
        }
        return false;
    }
}