# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: This code searches for a target in a row-wise and column-wise sorted matrix efficiently. It starts from the bottom-left corner and moves right if the current value is smaller than the target, or up if it’s larger. By eliminating one row or column at each step, it ensures a time complexity of O(m + n) with constant space. 

# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # TC: O(m + n)   SC: O(1)
        m = len(matrix)
        n = len(matrix[0])

        r, c = m - 1, 0

        while r >= 0 and c < n:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                c += 1
            else:
                r -= 1

        return False 