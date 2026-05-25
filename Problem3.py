# Time Complexity --> O(m+n) where m, n are the dimensions of matrix
# Space Complexity --> O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r = len(matrix)-1
        c = 0

        while r>=0 and c<len(matrix[0]):
            if matrix[r][c]==target:
                return True
            elif matrix[r][c] < target:
                c = c+1
            else:
                r = r-1
        return False 
