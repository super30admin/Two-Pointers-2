
// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes Both Approaches Worked
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/**
 * Binary Search complexity for 2-d Matrix ix O(m * logn) or O(m * log n ) depend up search whether is is rowise or columnwise
 * We will utilize two pointer approach to find elements
 * We have two approaches in two-pointer
 * Approach 1
 * Take top right element to compare with target .
 * 	If target is smaller,move to next column else move to next row
 * Keep comparing until matrix search space is exhausted or element is found
 * 
 * 
 * Approach 2 Take bottom left element to compare with target 
 * IF target is greater,move to next column else move to next row
 * Keep repeating the process until matrix search space is exhausted
 * or element is found
 */

public class SearchMatrix {
	public boolean search1(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 0 || matrix.length == 0)
			return false;
		int i = 0, j = matrix[0].length - 1, size = matrix.length;

		while (j >= 0 && i < size) {
			int value = matrix[i][j];
			if (value > target) {
				j--;
			} else if (value < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean search3(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 0 || matrix.length == 0)
			return false;
		int j = 0, i = matrix.length - 1, size = matrix[0].length;

		System.out.println(matrix[i][j]);
		while (i >= 0 && j < size) {
			int value = matrix[i][j];
			if (value < target) {
				j++;
			} else if (value > target) {
				i--;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		SearchMatrix search = new SearchMatrix();
		int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 5;
		System.out.print(search.search3(matrix, target));
	}
}

