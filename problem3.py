"""
Space Complexity: O(1) -> No extra memory

Time Complexity: O(m+n) -> In worst case, I have to traverse the length through all the rows and columns to get from top right to bottom left, if i start from top right. 
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        R,C = len(matrix), len(matrix[0])

        i = 0
        j = C - 1

        while i<= R-1 and j >= 0: 
            if target == matrix[i][j]: 
                return True
            elif matrix[i][j] > target: 
                j-=1
            else: 
                i+=1

        return False

