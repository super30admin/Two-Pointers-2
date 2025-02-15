// Time Complexity : O(m+n) where m is the number of rows and n is the number of columns
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// - Start from the top right corner of the matrix
// - If the target is greater than the current element, move down, else move left
// - Repeat the process until we find the target or reach the end of the matrix

// Your code here along with comments explaining your approach

class Search2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = 0;
        int n = matrix[0].length-1;

        while(m < matrix.length && n >= 0){
            if(matrix[m][n] == target){
                return true;
            }else if(matrix[m][n] < target){
                m++;
            }else{
                n--;
            }
        }
        return false;
    }
}