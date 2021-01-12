/* 
 * Complexity of algorithm is O(m*n) ,where m is no rows ,n is no of column.
 *  
 * */
public class Searcha2DMatrixII {

	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null || matrix.length == 0)
			return false;

		int n = matrix[0].length - 1;
		int m = matrix.length - 1;
		int i = 0;
		int j = n;

		while (i <= m && j >= 0) {

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
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 20;

		Searcha2DMatrixII objIn = new Searcha2DMatrixII();

		objIn.searchMatrix(matrix, target);

	}

}
