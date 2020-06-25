class Solution:
	def searchMatrix(self, matrix, target):
		"""
		:type matrix: List[List[int]]
		:type target: int
		:rtype: bool
		"""
		row = len(matrix)-1
		col = 0
		while(row>-1 and col<len(matrix[0])):
			if matrix[row][col]==target:
				return True
			elif matrix[row][col]>target:
				row-=1
			else:
				col+=1
		return False

#time complexity - O(m+n), m and n are the dimensions of input matrix

#space complexity - O(1)

#all test cases passed