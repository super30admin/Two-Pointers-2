// Time Complexity : O(m+n) where m is the number of rows and n is the number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
Start from top row righmost element / bottom row left most element. If the value at position is greater than our target,
move left. This elements the entire column below the position. If the value is lesser than our target, the move down.
Value is the target return true.
*/
// Your code here along with comments explaining your approach



public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        //null check
        if (matrix == null || matrix.length == 0)
            return false;

        //starting from right top corner element
        int i = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] == target) {
                return true;
            } else i++;
        }
        return false;
    }
}


