// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Simple brute force would be loop through the entire matrix and find the target element in [O(mxn) TC], one optimized solution would be perform binary search on each row making it [O(m*log(n)) TC], most optimized solution would be using single pointer method, to move in (left,bottom/bottom,left) direction or (top,right/right,top) direction making it [O(m+n) TC]

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;

        // row
        int m = matrix.length; 
        // column
        int n = matrix[0].length;

        // first row
        int i = 0;
        // last column
        int j = n - 1;

        // loop until my rows is less than 5 and my columns is greater than or equal to 0, because we chose the top right corner, hence we will be moving left to bottom
        while(i<m && j>=0){
            if (target == matrix[i][j]) return true;
            if (target < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}