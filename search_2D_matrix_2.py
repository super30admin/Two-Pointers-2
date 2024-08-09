# Time complexity = O(m+n)
# space complexity = O(1)
# Use pointers at top right corner and bottom left corner 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        r = m-1
        c = 0
        while (r >= 0 and c < n):
            if matrix[r][c] == target: return True
            elif matrix[r][c] < target:
                c += 1
            else:
                r -= 1
        return False
