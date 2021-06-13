
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// Take two pointers pointing to the top right corner of the matrix
// if the target is greater than the element at pointer move down the col or else move left in the row
// return true if the target is found else return false
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        System.out.println(row +" "+ col);
        while(row < matrix.length && col >= 0) {
            int curr = matrix[row][col];
            if(curr == target) {
                return true;
            }else if(curr < target) {
                row++;
            } else {
                col--;
            }
        }
        
        return false;
    }
}