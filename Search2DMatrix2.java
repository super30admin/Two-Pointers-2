// Time Complexity : O(m+n) - where m and n are lengths of the row and column
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach -:
The fact here is matrix is continuously sorted at top-right and bottom-left corners

If we start from top-right we can avoid 1 column or 1 row at a time because the
fact that it is continuously sorted.

With that approach we make utmost m + n to look for the target, if it is not we will
return false.

We can follow similar approach for bottom-left corner.
 */
public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int m = 0, n = matrix[0].length - 1;

        while(m < matrix.length && n >= 0) {
            if(matrix[m][n] == target) {
                return true;
            } else if(matrix[m][n] > target) {
                n--;
            } else {
                m++;
            }
        }

        return false;
    }
}
