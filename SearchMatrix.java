// Time Complexity : The time complexity is O(m+n) where m is the number of rows and n is the number of columns
// Space Complexity : The space complexity is O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since the rows and columns are sorted, we maintain 2 pointers m and n which are instantiated to matrix.length-1 and 0 respectively.
// If the current element is greater than the target, that means we need to move upward to find the target. And if the current element
// is smaller than thr target, that means we need to move rightward to find the target

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix[0].length == 0){
            return false;
        }

        int m = matrix.length-1;
        int n = 0;

        while(m>=0 && n<matrix[0].length){

            if(matrix[m][n] == target){
                return true;
            }
            // Move upward
            else if(matrix[m][n] > target){
                m--;
            }
            // Move rightward
            else{
                n++;
            }

        }

        return false;
    }
}