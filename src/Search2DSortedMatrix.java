/*
Problem - Search 2D sorted matrix II
Approach - Start from the bottom-left corner of the matrix or we can start from top-right corner
If the number is bigger, move up or move left; if it's smaller, move right or move down.
Keep checking until you find the target or exit the matrix bounds.
Time Complexity - O(m+n)
Space Complexity - O(1)
 */

public class Search2DSortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, column = n - 1; // search using top right corner as a start point
        while (row <m  && column >=0) {
            if (matrix[row][column] == target) return true;
            else if (matrix[row][column] > target) column--;
            else row++;
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = m-1, column = 0; // search using bottom left corner as a start point
        while (row >= 0 && column <n) {
            if (matrix[row][column] == target) return true;
            else if (matrix[row][column] > target) row--;
            else column++;
        }
        return false;
    }
    public static void main(String[] args) {
        Search2DSortedMatrix s2d = new Search2DSortedMatrix();
        int[][] values = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,21,23},
                {18,19,20,23,26}
        };
        System.out.println(s2d.searchMatrix(values, 20));
        System.out.println(s2d.searchMatrix2(values, 15));
        System.out.println(s2d.searchMatrix2(values, 30));
    }
}
