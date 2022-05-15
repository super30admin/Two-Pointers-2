// Time Complexity :O(M+N) where m and n are rows and columns 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int i=0;
        int j=c-1;
        while(i<r && j>=0)
        {
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]>target)  //when target is greater than the given element move the column
            {
                j--;
            }
            if( j>=0 && matrix[i][j]<target) //check the while condition if it is getting breaked
            {
                i++;
            }
        }
        return false;
    }
}