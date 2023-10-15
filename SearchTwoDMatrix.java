// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class SearchTwoDMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length, n = matrix[0].length;
            int i = 0, j = n - 1;

            //select a corner such that values should be both increasing and decreasing
            while(i <= m - 1 && j >= 0){
                if(matrix[i][j] == target){
                    return true;
                }
                else if(matrix[i][j] > target){
                    j--;
                }
                else{
                    i++;
                }
            }
            return false;
        }
    }
}
