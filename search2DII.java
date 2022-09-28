// TC : O(n)
// SC : O(1)

class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		 int n = matrix.length;
		 int j = 0;
		 for(int i = 0; i < matrix[0].length; i++) {
			  if (matrix[j][i] == target)
					return true;
			  else if (target < matrix[j][i] && j < n-1) {
					--i;
					++j;
			  } else if(j<n-1) {
					j++;
			  }
		 }
		 return false;
	}
}