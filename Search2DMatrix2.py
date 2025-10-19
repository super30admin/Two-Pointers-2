# Time Complexity : O(m + n) — in the worst case, you may move across one full row and one full column of the matrix.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
Start at either top right corner or bottom left corner (where there is a clear decision of lesser/greater numbers around it).
From upper right, if target is greater, move down. If target is smaller, move left.
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # start at upper right corner
        i = 0
        j = len(matrix[0])-1

        while i < len(matrix) and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                # move down
                i += 1
            else:
                # move left
                j -= 1
        
        return False