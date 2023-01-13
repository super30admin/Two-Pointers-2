public class Problem3 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
        System.out.print(searchMatrix(matrix, 5));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m && row >= 0 && col < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
