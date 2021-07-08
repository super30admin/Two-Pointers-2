// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem3;

public class SearchMatrix2 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int i = 0;
		int j = matrix[0].length - 1;
		while (i < m && j >= 0) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		SearchMatrix2 obj = new SearchMatrix2();
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 12;
		System.out.println("Is the element " + target + " present in the matrix? "
				+ (obj.searchMatrix(matrix, target) == true ? "Yes" : "No"));
	}

}
