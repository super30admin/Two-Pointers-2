// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
start from top right corner
while i<len(matrix) and j>=0
if element == target return true
if element > target reduce j
else increase i
if out of loop return false
*/
package main

import "fmt"

func searchMatrix(matrix [][]int, target int) bool {
	if len(matrix) == 0 {
		return false
	}
	i, j := 0, len(matrix[0]) - 1
	for j>=0 && i < len(matrix) {
		if matrix[i][j] == target {
			return true
		} else if matrix[i][j] > target {
			j--
		} else {
			i++
		}
	}
	return false
}

func MainSearch() {
	fmt.Println(searchMatrix([][]int {{1,1}}, 2))
}
