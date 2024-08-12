// Search for an element in a 2D Matrix
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: element to the left of row 0,column n-1 are decreasing and down are increasing
// So, search based on comparison of the value and target and increment row or decrement column accordingly

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >=0) {
            if(matrix[row][column] == target) {
                return true;
            } else if(matrix[row][column] > target) {
                column -- ;
            } else{
                row++;
            }
        }
        return false;
    }
}