class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        row = len(matrix)
        col = len(matrix[0])
        r = len(matrix) - 1
        c = 0
        while (r >= 0 and c < col):
            if(matrix[r][c] == target):
                return True
            elif (matrix[r][c] > target):
                r -= 1
            else:
                c += 1
        
        return False

matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
object = Solution()
print(object.searchMatrix(matrix, 5))