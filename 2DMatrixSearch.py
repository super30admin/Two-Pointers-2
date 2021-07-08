# Time Complexity : O(M + N)
# Space Complexity: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        m = len(matrix)
        n = len(matrix[0])
        col = n - 1
        
        while col >= 0 and row < m:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row+=1
            else:
                col-=1
        return False