// Time Complexity : O(m+n) where m = number of rows in matrix, n = number of columns in matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Problem3 {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        /// Initialise row and col pointer to the bottom left of the matrix
        int i = matrix.length-1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            // If value at cell is greater than target, decrement row pointer by 1
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target){ // If value at cell is less than target, increment col pointer by 1
                j++;
            } else { // If value at cell is equal to target, return true
                return true;
            }
        }
        // If not found, return false
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }
}
