#Approach
# Consider the left bottom as the Starting point, compare the index with target if target is greater move to the next column
# else move pointer to top row. Stop if result found else if index is greater than the 0 or columns no target found


# Complexities
# Time complexity: O(m+n)
# Space Complexity: O(1)





from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        r = m - 1
        c = 0

        while r >= 0 and c <= (n - 1):
            print(r, c)
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                r -= 1
            else:
                c += 1
        return False
s = Solution()
s.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],5)