
// Problem3 - https://leetcode.com/problems/search-a-2d-matrix-ii/

// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We are starting from [0, n-1] index and if target is lesser than the number, we decrease the column and rows remains the same or if target is larger, we do vice-versa.

public class problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}
