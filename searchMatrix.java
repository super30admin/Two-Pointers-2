// Time Complexity: we may have to traverse whole matrix at worst case: O(m*n)
// Space Complexity: No additional data structure used: O(1)
// Did you completed it on leetcode: Yes
// Any problems faced: No

// Write your approach here
// Idea here is to use 2 pointers to identify if the target is greater or lesser than last column value
// In case it is greater then we know that result doesn't lies in current row and we increment it
// in case it is smaller then it may exist on the left of last column in same row or any below rows, so we decrement the column
// finally we return true if value found else false
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) {
            return false;
        }
        int i = 0; int j=matrix[0].length-1;
        while(i<matrix.length && j>=0) {
            if(target==matrix[i][j]) {
                return true;
            } else if(target>matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}