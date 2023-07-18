// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Starting from the right top element and rejecting either one row or one column based on whether the current element is greater or smaller than the target. If the current element is greater than target, reject the remaining part of the column else reject the remainng part of the row 

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // pointers pointing at the right top index
        int i = 0;
        int j = matrix[0].length - 1;

        // run the loop till either we reach at the left end of coloumn or the bottom
        // end of the row
        while (i < matrix.length && j >= 0) {
            // if we find the element, return true else reject either column or row based on
            // the current element being greater or smaller than the target
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                i++;
            else
                j--;
        }

        return false;
    }
}