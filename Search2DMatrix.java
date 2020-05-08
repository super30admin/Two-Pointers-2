package com.ds.rani.twopointers;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * Example:
 * <p>
 * Consider the following matrix:
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * <p>
 * Given target = 20, return false.
 */

//Approach: The matrix property is that rows are sorted and columns are sorted so if
// I can start searching from bottom left corner or top right corner. So I started at bottom left corner and compare my target value
// if my target is less than current position then go up else target is greater then go right.
public class Search2DMatrix {

    //Time complexity : o(m+n) where m is number of rows, n is number of columns
    //Space complexity:o(1)

    /**
     * @param matrix 2d matrix
     * @param target value to be searched in matrix
     * @return true if value is there in matrix else false
     */
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        //row and col is pointing to the bottom left corner
        int row = rows - 1;
        int col = 0;
        //in above example start form 18,if target is less than 18 then serch up,else,serach to right
        while (row < rows && row >= 0 && col < cols && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            if (target < matrix[row][col])//then serch upward
                row = row - 1;
            else
                col = col + 1;

        }
        return false;

    }
    public static void main(String[] args) {
        int arr[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println( Search2DMatrix.searchMatrix( arr,5 ) );
        System.out.println( Search2DMatrix.searchMatrix( arr,20 ) );
    }
}
