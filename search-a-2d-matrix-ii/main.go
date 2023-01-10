package main

// Time : O(mXn) - where we traverse the entire matrix
// Space : O(1)
func searchMatrix(matrix [][]int, target int) bool {

	// if target == matrix[0][0]{
	//     return true
	// }

	m := len(matrix) - 1
	n := len(matrix[0]) - 1

	i := 0
	j := n

	for i <= m && j >= 0 {
		if matrix[i][j] == target {
			return true
		}
		if matrix[i][j] > target {
			j--
		} else {
			i++
		}
	}
	return false

}
