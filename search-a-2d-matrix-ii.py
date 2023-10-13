# // Time Complexity : O(M+N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES


# // Three line explanation of solution in plain english
# We try to employ 2 pointer approach and we try to eliminate either a row or a column by comparing the pivot element (Top-right)
# If the pivot is greater than the target then we ignore the top row (Move down - change pivot to down)
# If the pivot is less than the target then we ignore the right row (Move left - change the pivot to left)
#Until we get a single element - if it is the target then True - Else False


# // Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        nr, nc = 0, n-1
        while min(nr, nc) >= 0 and nr < m and nc < n:
            currVal = matrix[nr][nc]
            if currVal == target:
                return True
            elif target <= currVal:
                nr, nc = nr, nc-1
            else:
                nr, nc = nr+1, nc
        return False