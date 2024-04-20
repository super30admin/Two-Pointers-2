
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/** Using pointers to search the matrix, taking initial pointer top right element, if the value is larger,
then we increment row else we can decrement columns
*/
class Search2dMAtrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}