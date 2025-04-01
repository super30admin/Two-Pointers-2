// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach - start from the top-right corner of the matrix.
// - if the current value is greater than the target, move left (column--).
// - if the current value is less than the target, move down (row++).
// - repeat until we find the target or exit the matrix bounds.

public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = n - 1;   //start from top-right

        while(r < m && c >= 0) {
            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix2 solver = new Search2DMatrix2();

        int[][] matrix1 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target1 = 5;
        System.out.println("Searching for " + target1 + " in matrix1: " + solver.searchMatrix(matrix1, target1));

        int[][] matrix2 = {
                {1, 2, 3},
                {5, 6, 7},
                {8, 9, 10}
        };
        int target2 = 4;
        System.out.println("Searching for " + target2 + " in matrix2: " + solver.searchMatrix(matrix2, target2));
    }

}
