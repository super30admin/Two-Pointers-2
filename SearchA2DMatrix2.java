/* https://leetcode.com/problems/search-a-2d-matrix-ii/
LC: 240. Search a 2D Matrix II MEDIUM
Approach:
1. Brute force: O(n*m) - search all elements and compare
2. Binary search on each row - O(n * log m) => n: num of rows, m: num of cols
3. In 2nd approach, we are not using the property of columns being sorted.
   So, start from bottom-left element. The bottom-right element has the property that
   i. elements above it in the same column are in descending order
   ii. elements to the right of it in the same row are in ascending order
4. Use these properties, to decrement the row or increment the column at every comparison => Reduce search space
5. Alternatively, top-right element can also be used to start.
6. Element top-left and bottom-right cannot be used, because for these elements, 
   both the row and column are either both increasing or decreasing, 
   so there's no distinguishing property to reduce the search space.

   TC: O(n+m) - worst case, we reduce the column and row all the way to 0 and last row, respectively
*/
public class SearchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int numRows = matrix.length - 1;
        int numCols = matrix[0].length - 1;
        
        // Bottom-left element
        int r = numRows;
        int c = 0;
        
        // Reduce the search space
        while (r >= 0 && c <= numCols) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                // element may be above where we currently are
                r--;
            } else if (target > matrix[r][c]) {
                // element may be to the wight of where we currently are
                c++;
            }
        }
        return false;
    }
}
