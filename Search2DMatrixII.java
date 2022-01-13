// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: As given 2D matrix is sorted,  we are using Binary Search along rows and columns. USing BS we eliminate the search space by half and start the search with either top right or bottom left element in the matrix and move according to the target value whteher its less or greater tha n curr value

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //initializing length of matrix
        int m = matrix.length, n = matrix[0].length;
        
        //initializing  index of curr element in the matrix
        int i = 0; //row
        int j = n - 1; //column
        
        while( i < m && j >= 0){  //loop will run until index doesnt go out of bound
            int curr = matrix[i][j]; //current element
            
            if(target == curr) return true;   //search conditions
            else if(target < curr) j--;
            else i++;
        }
         
        return false;
    }
}