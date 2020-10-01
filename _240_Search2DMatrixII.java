package com.javadwarf.matrix.leetcode;

public class _240_Search2DMatrixII {

	public static void main(String[] args) {
		System.out.println(new _240_Search2DMatrixII().searchMatrix(new int[][] {{-1},{-1}}, 0));
	}

	
	//time (max(m,n)) and space o(1)
	
	// Idea is to start from top-left or bottom-left
	// lets start from bottom-left if current < k then go right else up
	
	public boolean searchMatrix(int[][] matrix, int k) {

		if(matrix == null|| matrix.length== 0|| matrix[0].length == 0) return false;

		int i = matrix.length-1;
		int j = 0;

		while(i>=0 && j<matrix[0].length){

			if(matrix[i][j] == k) {
				return true;
			}
			else if(matrix[i][j] < k ) {
				j++;
			}
			else {
				i--;
			}
		}
		return false;
	}
}
