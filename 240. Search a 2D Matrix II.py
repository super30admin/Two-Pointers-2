# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
	# Start from the top right corner of the matrix
	# if the element is equal to the target return it
	# if element > target then move one col behind as it will have smaller elements
	# if element < target then move one row below as it will have larger elements



class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        
        i = 0
        j = len(matrix[0]) - 1
        while(i < len(matrix) and j >= 0 ):
            if matrix[i][j] == target:
                return True
            if matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False