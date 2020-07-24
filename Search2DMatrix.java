// Time Complexity : O(N+M) where N and M is the length of the sides of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// We observe that this approach is similar to binary search in 1D array. So lets us consider our mid point as the top left
// corner. If the element at mid is less than target, we should search towards left of that column else there is guarantee
// the element is present in the same column or below the element so we move our pointer down. Any time the pointers move
// out of the matrix would mean my target is not present in the matrix, so return false.

// Your code here along with comments explaining your approach
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) return false;
        int col = matrix[0].length;
        if (col == 0) return false;

        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            if (matrix[i][j] == target) return true;
            if (matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}
