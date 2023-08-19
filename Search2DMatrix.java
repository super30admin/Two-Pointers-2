// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// for loops : o(m*n)
// row by row binary search : mlogn
// column by cloumn binary search : nlogm


// keep moving to the greater side and removeing all lesser columns...


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //null
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length; int n = matrix[0].length;
        int i = 0; int j = n-1; //first row and last column
        while( i < m && j >=0){  //i being increased and j is being decreased
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target){
                i++;
            } else{
                j--;
            }
        }
        return false;
    }
}
