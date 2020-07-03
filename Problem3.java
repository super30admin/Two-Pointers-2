/* Problem 3- Search 2D Matrix */

//Search Space reduction approach
// Time Complexity : O(m+n) since we are decrementing m rows or n columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
// Here we will follow search space reduction. In brute force, finding target requires O(mn)
// Our approach is to reduce the search space to minimum to find our target
// here first, we will compare target with last row and first column element
// Case 1) if it equals to target, return true
// Case 2) if its greater than target, decrement row
// Case 3) if its lesser than target, increment column
// else return false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge case
        if(matrix == null || matrix.length == 0)
        return false;
        //intialising pointers ptr1 to last row and ptr2 to first column
        int ptr1 = matrix.length-1;
        int ptr2 = 0;
        while(ptr1 >= 0 && ptr2 <= matrix[0].length-1){
            //Case 1) if it equals to target, return true
            if(matrix[ptr1][ptr2] == target)
                return true;
            //Case 2) if its greater than target, decrement row
            else if(matrix[ptr1][ptr2] > target){
                //decrement row
                ptr1--;
            }
            //Case 3) if its lesser than target, increment column
            else {
                //increment column
                ptr2++;
            }
        }
        //if it couldn't be found in any case, return false
        return false;
    }
}
