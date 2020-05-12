package s30Coding;

// Time Complexity :- m+n where m is the number of rows and n is the number of columns in the matrix.

//Space Complexity :- O(1)

//LeetCode :- Yes

//Logic :- Start with the last row's first column and check if is greater the target value or not and move the pointers accordingly.

public class Searchinamatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
	       int i = matrix.length-1;
	        int j = 0;

	        while (i >= 0 && j < matrix[0].length) {
	            if (matrix[i][j] > target) {
	                i--;
	            } else if (matrix[i][j] < target) {
	                j++;
	            } else { // found it
	                return true;
	            }
	        }

	        return false; 
	    }
}
