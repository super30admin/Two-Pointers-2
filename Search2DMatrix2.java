// Time Complexity -O(m*logn)
// Space Complexity - O(1)

public class Search2DMatrix2 {

    // Approach 1 - Start from top right part of matrix
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix==null || matrix.length == 0) return false;
            int m = matrix.length;
            int n = matrix[0].length;
            int i =0 ;
            int j = n-1;
            while (i<m && j>=0) {
                if(matrix[i][j] == target) return true;
                else if ( matrix[i][j] > target) j--;
                else i++;
            }
            return false;
        }
    }

    //  Approach 2 - Start from Bottom left part of matrix
    static class Solution2 {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix==null || matrix.length == 0) return false;
            int m = matrix.length;
            int n = matrix[0].length;
            int i = m-1 ;
            int j = 0;
            while (i>=0 && j<n) {
                if(matrix[i][j] == target) return true;
                else if ( matrix[i][j] > target) i--;
                else j++;
            }
            return false;
        }
    }
}
