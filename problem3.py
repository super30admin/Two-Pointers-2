# Search a 2D Matrix II
#Time Complexity: O(m+n)
#Space Complexity: O(1)


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix)==0 or len(matrix[0])==0:
            return False
        
        height = len(matrix)
        width = len(matrix[0])

        row = height - 1
        col = 0

        while row >= 0 and col < width:
            if matrix[row][col] > target:
                row -=1
            elif matrix[row][col] < target:
                col += 1
            else:
                return True
        return False