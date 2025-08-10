public class SearchMatrix {
    /*
Time Complexity : O(m + n) where m is number of rows and n is number of columns
Space Complexity : O(1) - no extra space used
Did this code successfully run on Leetcode : Yes

Explanation:
Start from top-right corner of the matrix.
If the current element is equal to target, return true.
If current element is greater than target, move left (decrease column).
If current element is less than target, move down (increase row).
Repeat until out of bounds or target found.
*/
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        if (cols == 0) return false;

        int r = 0;
        int c = cols - 1;

        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }

    // Example usage
    public static void main(String[] args) {
        SearchMatrix sol = new SearchMatrix();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target1 = 5;
        int target2 = 20;

        System.out.println("Search " + target1 + ": " + sol.searchMatrix(matrix, target1)); // true
        System.out.println("Search " + target2 + ": " + sol.searchMatrix(matrix, target2)); // false
    }
}
