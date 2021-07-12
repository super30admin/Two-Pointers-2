class Solution:
    def searchMatrix(self, matrix, target) :

        if len(matrix) == 0 or matrix == None:
            return False

        m = len(matrix)
        n = len(matrix[0])

        row = m - 1
        col = 0

        while col < n and row >= 0:
            if matrix[row][col] > target:
                row -= 1
            elif matrix[row][col] < target:
                col += 1
            else:
                return True

        return False

sol=Solution()
matrix= [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target=5
print (sol.searchMatrix(matrix,target))