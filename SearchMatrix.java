/**
Problem: Search in a sorted matrix.
Time Complexity: O(m+n) where m is the number of rows, and n is the number of columns of the given matrix.
Space Complexity : O(1)


*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n -1;
        //matrix[i][j] currently points to the last element of the first row
        while(i<m && j>= 0) {
            if(matrix[i][j] == target) {
                return true;
            }
            else if(matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
