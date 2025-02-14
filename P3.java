//Binary Search

// Time Complexity : O(m logn) cause we are iterate through m rows and performing bs
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        //m < n
        for (int i = 0; i < m; i ++) {
            boolean found = binarySearch(matrix, i, n, target);
            if (found)  return true;
            }
            return false;
        }
        private boolean binarySearch(int[][] matrix, int row, int n, int target) {
            int low = 0; int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int curr = matrix[row][mid];
                //mid we found the target
                if (matrix[row][mid] == target){
                    return true;
                } else if (curr > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return false;
        }
    }

//Staircase approach

// Time Complexity : O(log(m x n)) 
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Start at the top right element and see if the target is smaller or greater than it, once we know we will move accordingly 

// Your code here along with comments explaining your approach

    public class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
                return false;
            }
    
            int col = matrix[0].length - 1; // Start from the last column (rightmost element)
            int row = 0; // Start from the first row (top row)
    
            while(col >= 0 && row <= matrix.length - 1) {
                if(target == matrix[row][col]) { // Target found
                    return true;
                } else if(target < matrix[row][col]) { // Target is smaller, move left
                    col--;
                } else if(target > matrix[row][col]) { // Target is larger, move down
                    row++;
                }
            }
            return false; // Target not found
        }
    }