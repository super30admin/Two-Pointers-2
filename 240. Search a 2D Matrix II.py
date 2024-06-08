# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(max(m,n))
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        '''
        - Maintain one pointer starting from either top right or bottom left
        - Splitting into 3 cases, if the target is found, return true.
        - Otherwise move top or left if target is lower and move bottom or right if target is higher
        '''
        rows = len(matrix)
        cols = len(matrix[0])
        i = 0
        j = cols - 1
        while(i < rows and j >= 0):
            if target == matrix[i][j]:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1
        return False