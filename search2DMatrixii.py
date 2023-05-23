#TC: O(max(m, n))
#SC: O(1)

class Solution(object):

    def searchMatrix(self, matrix, target):

        if (matrix == None or len(matrix) == 0):
            return False

        rows = len(matrix)
        cols = len(matrix[0])
        currRow = rows - 1
        currCol = 0

        while (currRow >= 0 and currCol < cols):
            if (matrix[currRow][currCol] == target):    
                return True
            elif (matrix[currRow][currCol] < target):   
                currCol += 1
            else:                 
                currRow -= 1

        return False