// Time Complexity : O(log(m+n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//eliminate rows and cols based on the element and target, if found return true
//else if the element<target, increment row
//else decrement column (start column traversing from the end)


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0|| matrix[0] == null || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int i=0;
        int j = cols -1;
        while(i<rows && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;

    }
}