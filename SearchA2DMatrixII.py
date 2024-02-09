'''
TC: O(m+n)
SC: O(1)
'''
from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i, j = len(matrix)-1, 0
        while i>=0 and j>=0 and i<len(matrix) and j<len(matrix[0]):
            if matrix[i][j] == target:
                 return True
            if matrix[i][j] < target:
                j+=1
            else:
                i-=1
        return False
s = Solution()
print(s.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5))
print(s.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 20))