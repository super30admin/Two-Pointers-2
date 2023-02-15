# Author: Naveen US
# Titile: Search 2d matirx.

# Time complexity: O(m+n)
# Space complexity: O(1)
# Did the code run on leetcode: Yes


def searchMatrix(matrix, target):
	m, n = len(matrix), len(matrix) and len(matrix[0])
	r, c = 0, n-1
	while r < m and c >= 0:
		if target > matrix[r][c]:
			r += 1
		elif target < matrix[r][c]:
			c -= 1
		else: return True
	return False
