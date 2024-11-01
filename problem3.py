# time complexity: O(m+n)
# space complexity: O(1)
# Approach: I have used two pointers r and c. I have started from the top right corner(we can also start from bottom left). If the element at the current position is equal to the target, I will return True. If the element at the current position is greater than the target, I will decrement the column. If the element at the current position is less than the target, I will increment the row. I will return False if I reach the end of the matrix.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n-1

        while r<m and c>=0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1
        return False