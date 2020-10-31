/**LC-240   Search 2D Matrix II
 * Time Complexity : worst case: O(m+n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : I forgot to check the edge case
 *
 Algorithm: ZIG ZAG PATH
 Since rows are sorted from left to right and columns are sorted from top to bottom,
 If we take the top right most element or bottom left most element, we will observe that there is only
 one direction which we can choose based on the comparison...i.e if the current element is smaller than the
 top right most element, then it will be present only on the left side and not the bottom.

 */
package TwoPointers;

public class Search2dMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;

        while(j >=0 && i < m){

            if(matrix[i][j] == target) return true;

            else if(matrix[i][j] > target) j--;

            else i++;

        }

        return false;

    }
}
