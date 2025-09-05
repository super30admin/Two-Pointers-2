# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Three line explanation of solution in plain english : We take a pointer either at top right or bottom left as those are the
# corners where we are definite about either going left which is less than the current or going down which is greater that the current value.
# Then based on the target value we can keep moving the pointer withing bounds, if it goes out of bounds and we don't get the target then we return False


# Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r = 0
        c = len(matrix[0]) - 1

        while r >= 0 and r < len(matrix) and c >= 0 and c < len(matrix[0]):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1

        return False
