# TC = O(m+n)
# SC = O(1)
# We select either top-right corner or bottom-left corner - at these points we can traverse to lower or higher side
# We perform binary search method- traverse down or left if target is greater or lesser than matrix element considered. We do this until we reach bottom right or target found. Hence, the worst time complexity is O(m+n)  
class Solution:
    def searchMatrix(self, matrix, target):
        if len(matrix) == 0 or len(matrix[0]) == 0: return False
        m, n = len(matrix), len(matrix[0])
        i, j = 0, n-1
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j-= 1
            else:
                i+=1
        return False

obj = Solution()
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 20
print(obj.searchMatrix(matrix, target))

matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
print(obj.searchMatrix(matrix, target))