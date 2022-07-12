// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english: As the given matrix is sorted individually rows and colums wise, we will start from the right most element of the first row, and then if the target element if grater then the pointer on the current element then shift on left and if it is smaller then move down in row

// Your code here along with comments explaining your approach: 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r = 0;
        int c = n - 1;
        
        while(r < m && c >= 0){
            if(target > matrix[r][c]){
                // move down
                r++;
            }
            else if(target < matrix[r][c]){
                //move left
                c--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}