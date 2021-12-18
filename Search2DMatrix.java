// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Starting from rightmost top element
        int i = 0;
        int j = n-1;

        while(i<m && j>=0) {
            // Idea is to compare the current element with the target,
            // if the element equals target, we found it, so returning true
            // otherwise we search for the element, if its less than the current element, then we move towards left
            // else move down
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
