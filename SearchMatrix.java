// Time Complexity : O(n+m). m and n is the length of the row and m is the columns 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     if(matrix==null || matrix.length==0) return false;
		
		int  i=0,j=matrix[0].length-1;
		while(i>=0 &&i<matrix.length && j<matrix[0].length 
				&& j>=0) {
			if(matrix[i][j]==target) return true;
			else if(matrix[i][j]>target) {
				j--;
			}else {
				i++;
			}
		}
		return false;   
    }
}
