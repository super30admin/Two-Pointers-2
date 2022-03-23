// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //staircase interation

        int m = matrix.length;
        int n = matrix[0].length;

        //start from top right corner
        int i=0, j=n-1;

        while(i<m && j>=0)
        {
            if(matrix[i][j] == target)
                return true;
            //if num < target, change row
            else if(matrix[i][j] < target)
                i++;
            else
                j--;
        }

        return false;
    }
}
