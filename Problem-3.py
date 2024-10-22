'''
    Time Complexity: O(m+n)
    Space Complexity: O(1)
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i, j = len(matrix) - 1, 0

        while 0 <= i and j < len(matrix[0]):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                j += 1
            else:
                i -= 1
        
        return False

        
        