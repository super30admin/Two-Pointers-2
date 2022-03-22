package main

// time: o(m+n)
// space: o(1)
func searchMatrix(matrix [][]int, target int) bool {
	if matrix == nil || len(matrix) == 0 {
		return false
	}

	m := len(matrix) - 1
	n := 0

	for m >= 0 && m <= len(matrix)-1 && n >= 0 && n <= len(matrix[0])-1 {

		ele := matrix[m][n]
		if ele == target {
			return true
		} else if target > ele {
			n++
		} else {
			m--
		}
	}

	return false
}
