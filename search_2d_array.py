# Time Complexity - O(n)
# Space Complexity - O(1)

class Solution:
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0
        j = len(matrix[0])-1
        while i<len(matrix) and j>=0:
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]<target:
                i = i+1
            else:
                j = j-1
        return False
