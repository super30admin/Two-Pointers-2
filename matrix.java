// Time Complexity : O(MxN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] v, int val) {
        int m=v.length;		// length of the matrix
        if(m==0)			// base case
            return false;
        int n=v[0].length;	// column length
        if(n==0)
            return false;
        int row=0,col=n-1;		// initialize row and column of the matrix
        while(row<m && col>=0)		// edge conditions
        {
            if(val>v[row][col])		// if the value is greater than the last element, increment row
                row++;
            else if(val<v[row][col])	// if the value is lesser than the last element, decrement column
                col--;
            else
                return true;			// if found, return true
        }
        return false;			// if not found, return false
    }
}