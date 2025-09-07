// Time complexity - O(m+n)
// Space complexity - O(1)
function searchMatrix(matrix: number[][], target: number): boolean {
	let low = 0;
	let high = matrix[0].length - 1;

	while (low < matrix.length && high >= 0) {
		if (matrix[low][high] === target) return true;
		else if (matrix[low][high] > target) {
			high--;
		} else {
			low++;
		}
	}
	return false;
}
