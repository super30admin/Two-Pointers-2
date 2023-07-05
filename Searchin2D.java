class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int start = 0;
        int end = colLength - 1;

        while (start < rowLength && end >= 0) {

            if (matrix[start][end] == target) {
                return true;
            } else if (matrix[start][end] > target) {
                end--;
            } else {
                start++;
            }

        }

        return false;

    }
}