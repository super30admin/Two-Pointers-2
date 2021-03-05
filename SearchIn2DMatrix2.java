// Time Complexity : O(log(m + n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//  - initialize a pointer at either top-right(or bottom-left) element.
//  - compare with the target
//      - if target is less than the pointer element, look into that row
//      - else increase the column

public class SearchIn2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = n - 1;

        while (r < m && c >= 0) {
            if (target == matrix[r][c])
                return true;
            else if (target < matrix[r][c])
                c--;
            else
                r++;
        }
        return false;
    }
}
