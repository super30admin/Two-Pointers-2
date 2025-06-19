// Time Complexity: O(rows + cols)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes

class SearchIn2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // We start the search from the top right corner of the matrix and go to the element below or to the left next
        int r = 0;
        int c = cols - 1;

        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            }
            else if (matrix[r][c] < target) {
                r++;
            }
            else {
                c--;
            }
        }
        return false;
    }
}

class SearchIn2DMatrixIIRunner {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int target = 5;
        SearchIn2DMatrixII searchIn2DMatrixII = new SearchIn2DMatrixII();

        System.out.println(searchIn2DMatrixII.searchMatrix(matrix, target));
    }
}