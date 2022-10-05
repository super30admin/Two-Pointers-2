'''
Time Complexity: O(m+n)
Space Complexity: O(1)
'''
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        row = 0
        rowlen = len(matrix)
        collen = len(matrix[0])
        col = collen-1
        while(row>=0 and row<rowlen and col>=0 and col<collen):
            #print(matrix[row][col])
            if(matrix[row][col]==target):
                return True
            elif(matrix[row][col]>target):
                col -=1
            else:
                row += 1
        return False