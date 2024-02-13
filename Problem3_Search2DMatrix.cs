// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        int m = matrix.Length - 1;
        int n = matrix[0].Length - 1;
        int low = 0;
        int high = n;
        // Begin search from top right or bottom left corner, as we can have firm choice of which side to search
        // Starting from Top Right corner
        while(low <= m && high >= 0) {
            if(matrix[low][high] == target) {
                return true;
            }
            else if(matrix[low][high] < target) { // Search down
                low++;
            }
            else { // Search left
                high--;
            }
        }
    }
}