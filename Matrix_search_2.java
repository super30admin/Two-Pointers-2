
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since each rows and columns are in incrementing order, if search is strted from first row last column,
// then based on taget value matrix index can be moved. 
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0){
            return false;
        }

        int m = matrix.length; // row
        int n = matrix[0].length; // column
        
        //first row last column
        int row = 0;
        int col = n-1;

        while(row < m && col>=0){
            if(target > matrix[row][col]){
                row++;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
