
// Time Complexity : O(M+N)  this is the maximum number of elements we traverse in worst case
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//initialize two pointers which are row and col in this case. We start from bottom left.
//loop the 2D matrix to find the target
// if target value found return true
// if target is greater than current value move right, increment col.
// else if target is lesser then current value, move up and decrement row.
// finally return false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //initialize two pointers which are row and col in this case. We start from bottom left.
        int row= matrix.length-1, col= 0;
        
        //loop the 2D matrix to find the target
        while(row>=0 && col< matrix[0].length){
            if(target == matrix[row][col]){ // if target value found return true
                return true;
            }else if(target > matrix[row][col]){ // if target is greater than current value move right, increment col.
                col++;
            }else{ // else if target is lesser then current value, move up and decrement row.
               row--; 
            }
        }
        
        return false;
    }
}