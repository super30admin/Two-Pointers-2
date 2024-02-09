// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// start from top right: number left to it is smaller
// numer right to it is bigger. if target is bigger go down;
// if target is smaller go left; 
// this way we can eliminate one row/column in each pass

// Your code here along with comments explaining your approach

class SearchSorted2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        // while i and j are in bounds
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}