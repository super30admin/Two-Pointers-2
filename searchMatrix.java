// Time Complexity: O(m+n) where m is number of rows and n is number of columns
// Space Complexity: O(1) as we are using constant space   
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * We can either start from the top-right corner or bottom-left corner of the matrix since the problem states that each row is sorted from left to right and each column is sorted from top to bottom.
 * We will start from the top-right corner. If the current element is equal to the target, we return true. 
 * If the current element is greater than the target, we move left (decrement column) since all elements to the right will be even greater than the current element.
 * If the current element is less than the target, we move down (increment row) since all elements to the left of the current element in that row will be even smaller thereby eliminating them and we would have already eliminated the values to the right of the current element in the previous step.so, there is no chance of finding the target in that row.
 * We continue this process until we either find the target or go out of bounds of the matrix.
 */


class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m=matrix.length;
        int n=matrix[0].length;
        int r=0;
        int c=n-1;
        while(r<m&&c>=0)
        {
            if(matrix[r][c]==target)
            {
                return true;
            }
            else if(matrix[r][c]>target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return false;
        
    }
}