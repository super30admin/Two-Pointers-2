
// Time Complexity : O(m+n) worst case
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// start with top row last element matrix[0][m-1]. Rows are sorted and columns are given sorted
// if element at current index is greater than target. Move right i.e decrement the column index matrix[i][j-1]
// else move downwards i.e increment row index. Base condition is when element at current index is equal to  target then return true;
// If after traversing the whole array i.e max (m+n) elements, we dont find target then element doesnt exist in this 2d array, so return false.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Time Complexity: O(m+n)
        // Space O(1)
        int n = matrix.length; //no of rows
        int m = matrix[0].length; //no of columns

        int i =0; int j = m-1;
        while(i<=n-1 && j>=0){

            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }

        return false;
        
    }
}