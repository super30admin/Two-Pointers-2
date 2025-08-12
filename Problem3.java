

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// We are using a two-pointer approach to search for the target in the matrix.
// We start from the top-right corner and move left or down based on the comparison.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int i=0,j=m-1;
        while(i<n&&j>=0){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target){   // Current value is too small, move down to get a larger value
                i++;
            }else{
                j--;               // Current value is too large → move left to get a smaller value
            }
        }
        return false;
    }
}