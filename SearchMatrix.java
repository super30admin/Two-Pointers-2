/* Time Complexity :  O(m+n)
   Space Complexity :   O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int i=m-1,j=0;
        while(i>=0 && j<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j] > target){
                i--;
            }
            else
            {
                j++;
            }
        }
        return false;       
    }
}