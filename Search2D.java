// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : start from corners, from where we can decide our next step
// to move based on comparison with the target value. Leverage the sorted order property of the matrix. We discard rows
// and column based on the value of the target.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0; // starting row
        int j = n-1; // starting colum

        while( i < m && j >= 0){
            
            if(matrix[i][j] == target){ // found
                return true;
            }
            else if(matrix[i][j] > target){ // we need to move left for searching smaller number
                j--;
            }
            else{ // // we need to move down for searching larger number
                i++;
            }
        }

        return false;

    }
}