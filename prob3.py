# Time Complexity :O(m+n)
# Space Complexity :O(1)
# Leet Code: Yes

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        row = len(matrix)
        col = len(matrix[0])

        r = 0
        c = col-1

        while r <= row-1 and c >= 0:
            if matrix[r][c] == target:
                return True

            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1

        return False