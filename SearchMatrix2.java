// Approach: Start at the top-right corner of the matrix. If the element at current cell is < target, exclude the current row from
// search, as all elements in this row are also < target due to row-wise sorting. Similarly, if the element at current cell is > target,
// exclude the current column from search, as all elements in this column are greater than target due to column-wise sorting.
// Time Complexity: O(m + n) where m - arr1 size, n - arr2 size
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/search-a-2d-matrix-ii/description/

public class SearchMatrix2 {

    boolean search(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Target found at matrix[" + row + "][" + col + "]" );
                return true;
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchMatrix2 sm2 = new SearchMatrix2();
        int[][] matrix = {
                { 1,4,7,11,15 },
                { 2,5,8,12,19 },
                { 3,6,9,16,22 },
                { 10,13,14,17,24 },
                { 18,21,23,26,30 }
        };
        int target = 30;
        System.out.println("Target found in given matrix (true/false): " + sm2.search(matrix, target));
    }
}