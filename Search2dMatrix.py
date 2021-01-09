'''
    Time Complexity:
        O(m+n) (where m = number of rows, n = number of columns)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Start at top left.
        If this is the target, return True.
        If this is bigger than the target, go left.
        Else go down.
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        col = len(matrix[0]) - 1

        while col >= 0 and row < len(matrix):
            num = matrix[row][col]
            if num == target:
                return True

            if num > target:
                col -= 1
            else:
                row += 1

        return False
