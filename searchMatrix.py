"""
Approach: Here we are using pointers to elimate a row or column.
we can start with top right or botton left element to proceed forward
For now i am taking top right. so initializing row to 0 and column to n -1
if matrix[r][c] == target, then we return true.
If matrix[r][c] > target, then the entire column will not have the target. so we decrement the column
If matrix[r][c] < target, then the target wont be in that particular row. so we remove that row from consideration.
We will check till the row and column are out of bound.
If the atrget is not found, we return false.

T.C : O(m+n)
S.C : O(1)

Passed on leetcode: yes
Any Issues: No
"""

from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n - 1
    
        while(  r < m and c >= 0 ):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1
        return False

sol = Solution()    
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
print(sol.searchMatrix(matrix, target))