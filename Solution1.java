
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I start from last element of first row and check if element at that position is greater than target. If so, I move to the left, i.e decrement
 * the column count by 1. By doing so, I'm reducing the search space and not including items which will be greater than target.
 * Similarly if element at that position would've been smaller than the target, I would've increased the row count by 1 and reduced the
 * search space by not including elements which will be lesser than the target. 
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(i<=m-1 && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}