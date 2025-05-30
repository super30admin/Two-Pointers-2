'''
Time Complexity: O(m + n)
Space Complexity: O(1)

Approach: 
We start from te bottom-left corner of the matrix and move either right or up based on the comparison with the target value.
If the current element is equal to the target, we return True.
If the current element is less than the target, we move to the right.
If the current element is greater than the target, we move to the up.
'''

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        n = len(matrix[0])
        m = len(matrix)
        r = m - 1
        c = 0

        while r >= 0 and r <= m - 1 and c >= 0 and c <= n - 1:
            if matrix[r][c] == target:
                return True

            if matrix[r][c] < target:
                c += 1

            else:
                r -= 1

        return False
