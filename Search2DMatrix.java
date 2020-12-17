// Time Complexity : O(M+N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
*Maintaining a pointer at top right corner of matrix. if target is less than the element at mat[i][j] then decrement j or else increment i, 
*/

public class Search2DMatrix{
	
	private boolean searchTarget(int[][] matrix, int target) {
		if(matrix==null || matrix.length==0) {
			return true;
		}
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int i =0, j=n-1;
		
		while(i<m && j>=0) {
			if(matrix[i][j]==target) {
				return true;
			}
			else if(matrix[i][j]>target) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Search2DMatrix ob = new Search2DMatrix();
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(ob.searchTarget(matrix,5));
	}
}