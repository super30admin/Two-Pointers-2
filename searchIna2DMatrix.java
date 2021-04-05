// Time Complexity : O(m+n) where m is the length of the column and n is the length of the row
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, end = matrix[0].length - 1;
        while(end >=0 && start <= matrix.length - 1) {
            int val = matrix[start][end];
            // target is smaller so move on the left
            if(val > target) {
                end--;
            }
            // target is greater so move down
            else if(val < target) {
                start++;
            }
            // element found
            else if(val == target) {
                return true;
            }
        }
        return false;
    }
}
