//The time complexity is O(m+n)
// The space complexity is O(1) as we are not using any extra space
// This solution is submitted on leetcode

public class SearchInA2DMatrixBigN37 {
	public boolean searchMatrix(int[][] matrix, int target) {
		// edge case
		if (matrix == null || matrix.length == 0)
			return false;
		int row = matrix.length;
		int column = matrix[0].length;
		int i = 0;
		int j = column - 1; 
		while (i < row && j >= 0) {
			if (matrix[i][j] == target)
				return true;
			else if (matrix[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
	}
}
