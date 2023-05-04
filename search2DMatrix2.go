// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We use the 2 pointer pattern for this problem. The pointers are the row and
column pointers, and in each iteration through the array, either one moves 1
step closer to the solution (or to the boundary if it doesn't exist).
There are 2 places that we can place the row, col pointers. We choose to place
it in the (0,m) position so that we can move the column pointer leftwards in
case the target is smaller than the current element, or else we move the row
pointer downwards in case its larger. This way, we eventually arrive at the
target. This only works since we are given that the rows are in asending order
and the columns are also in ascending order.

*/

package main

func searchMatrix(matrix [][]int, target int) bool {
	if len(matrix) == 0 {
		return false
	}

	m, n := len(matrix), len(matrix[0])
	// two pointer approach
	row, col := 0, n-1 // top right of matrix

	for row < m && col >= 0 {
		if matrix[row][col] == target {
			return true
		} else if matrix[row][col] > target {
			col--
		} else {
			row++
		}
	}

	return false
}
