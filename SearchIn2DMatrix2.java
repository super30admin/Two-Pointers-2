/*
    Leetcode problem 240: Search a 2D Matrix II
    T.C: O(m + n) :: S.C: O(1)

    Solved using a single pointer: the pattern we can observe here is that
    the elements from the top-right corner (or bottom-left corner) have decreasing
    order towards the left and increasing elements towards the bottom (opposite for
    the other corner). Using this pattern we can move towards the target element by
    going left when we are standing at a larger element and down for a smaller element.
    This form of traversal should get us to the target.
*/

class Solution {
    int[] down = new int[] {1, 0};
    int[] left = new int[] {0, -1};

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } 
            else if (matrix[i][j] > target) {
                i += left[0];
                j += left[1];
            } 
            else {
                i += down[0];
                j += down[1];                
            }
        }

        return false;
    }
}