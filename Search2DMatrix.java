public class Search2DMatrix {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int i = matrix.length - 1;
        int j = 0;

        while(i >=0 && j < matrix[0].length) {
            if(matrix[i][j] == target) {
                return true;
            }else if(matrix[i][j] < target) {
                j++;
            }else {
                i--;
            }
        }

        return false;
    }
}
