# Time complexity - O(m + n)
# Space complexity - O(1)

# Approach - We start from rightmost corner of the matrix because then for every element of the matrix
# we have a left element that is smaller than it and bottom element that is bigger. We establish a comparison
# criteria to get a path to the target.

from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        r, c = m - 1, 0

        while r >= 0 and c < n:
            if matrix[r][c] == target:
                return True
            elif target < matrix[r][c]:
                r -= 1
            else:
                c += 1
        
        return False