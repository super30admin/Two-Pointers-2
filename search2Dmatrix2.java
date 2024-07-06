
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// Start the search from top right corner. If the target is less than the top-right corner element, skip that column and decrement column
// pointer. If the target is greater then search in that column by incrementing row pointer.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int m = matrix.length;
     int n = matrix[0].length;

     int r =0;
     int c = n-1;
    
     while(c>=0 && r<m){
        if(matrix[r][c]==target){
            return true;
        }else if(matrix[r][c]<target){
            r++;
        }
        else{
            c--;
        }
     }  
     return false; 
    }
}