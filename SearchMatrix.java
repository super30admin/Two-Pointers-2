public class SearchMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int i = 0, j = matrix[0].length - 1;
		while (i >= 0 && i < matrix.length && j >= 0) {
			if (matrix[i][j] == target)
				return true;
			else if (matrix[i][j] > target)
				j--;
			else
				i++;
		}
		return false;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		boolean a = searchMatrix(mat, 20);
		System.out.println(a);

	}

}
