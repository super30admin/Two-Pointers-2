/** 
*Time Complexity :O(m+n)
*Space Complexity :O(1)
*
*Did this code successfully run on Leetcode : Yes
*
*Three line explanation of solution in plain english : 
*
*Two pointers -
*Start to search the matrix from left bottom corner, initialize the current position to left bottom corner.
*If the target is greater than the value in current position then the target can not be in entire row of current position 
*because the row is sorted, similary column is sorted too. 
*
*Your code here along with comments explaining your approach
*
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
	//edge
	if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
        return false;
        
    // Start from left bottom, 
    // when matrix[i][j] > target, exclude i row by moving to top
    // when matrix[i][j] < target, exclude j column by moving to right        
	int i = matrix.length-1;
	int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else { 
                return true;
            }
        }
        return false; 
	}
}

