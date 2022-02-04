public class Search2D {
    public boolean searchMatrix(int[][] m, int target) {

        int row = 0;
        int col = m[0].length - 1;

        while (row <= m.length - 1 && col >= 0) {
            if (m[row][col] > target) {
                col--;
            } else if (m[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
// O(m+n)
// O(1)
