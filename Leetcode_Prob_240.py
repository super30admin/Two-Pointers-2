# Problem: Search a 2D Matrix II
# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Approach: Two pointers
# 1. Initialize two pointers row and col at 0th index and last column respectively. 
# 2. Iterate through the matrix and compare the element at row and col with the target.
# 3. If the element is equal to target, then return True.
# 4. If the element is less than target, then increment row by 1.
# 5. Else decrement col by 1.
# 6. Return False.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False

        row, col = 0, len(matrix[0]) - 1
        
        while row < len(matrix) and col >= 0:
            current = matrix[row][col]
            if current == target:
                return True
            elif current < target:
                row += 1
            else:
                col -= 1
        
        return False   