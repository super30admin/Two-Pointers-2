class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        row = 0
        col = n-1

        while row < m and col >=0 :
            if target == matrix[row][col]:
                return True
            elif target > matrix[row][col]:
                row += 1
            else:
                col -= 1

        return False

#TC: O(n+m)
#SC: O(1)