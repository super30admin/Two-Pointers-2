public class Problem3 {
    // Time Complexity : O(n + m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    // Idea here is to make use of the given information
    // For a position in matrix left elements are smaller and below elements are bigger
    // So if target is smaller than the current element then it is for sure in the left part of the matrix or else is in the rows below the current
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int j = n - 1;
            int i = 0;
            while (i < m && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                }

                if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
            return false;
        }


    }
}
