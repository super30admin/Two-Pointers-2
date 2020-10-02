# Time Complexity: O(N)
# Space Complexity: O(1)
# Leetcode all test cases passed: Yes
# Any difficulties: No



class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or not matrix[0]:
            return False
        
        left = 0
        right = len(matrix[0])-1
        
        while left < len(matrix) and right >= 0:
            if matrix[left][right] == target:
                return True
            if matrix[left][right] > target:
                right -= 1
            else:
                left += 1
        return False
