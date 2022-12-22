# Time Complexity: O(rows+columns)
# Space Complexity: O(1)
# Successfully ran on leetcode
 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])
        i = 0
        j = cols-1
        while i<rows and j>=0:
            if matrix[i][j]==target:
                return True
            elif target>matrix[i][j]:
                i+=1
            elif target<matrix[i][j]:
                j-=1
        return False