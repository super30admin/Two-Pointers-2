// Time Complexity: O(n)
// Space Complexity: O(1). searching in done in the array using specific pointer without using any extra space

// diagonal element is checked and the row and col pointers are updated accordingly.
public class Searcha2DMatrixII {

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } }, 5)); // true
        System.out.println(searchMatrix(new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } }, 20)); // false
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            if (target == matrix[row][col])
                return true;
            else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

}
