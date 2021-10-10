#TC = O(n+m)
#SC = O(1)
#Compiled and run on Leetcode


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if (matrix == None and len(matrix) == 0 and len(matrix[0]) == 0):
            return True

        m = len(matrix) - 1
        n = len(matrix[0]) - 1

        currcol = n
        currrow = 0

        while (currrow <= m and currcol >= 0):
            if (target == matrix[currrow][currcol]):
                return True
            elif (target < matrix[currrow][currcol]):
                currcol -= 1
            else:
                currrow += 1

        return False

