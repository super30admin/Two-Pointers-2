# time: O(n)
# space: O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        r, c = 0, len(matrix[0]) - 1
        print(r,c)
        while r < len(matrix) and c >= 0:
            if target == matrix[r][c]:
                return True
            elif target > matrix[r][c]:
                r += 1
            else:
                c -= 1
        return False