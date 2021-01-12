# Created by Aashish Adhikari at 8:50 PM 1/11/2021

'''
Time Complexity:
O(m + n)

Space Complexity:
O(1)
'''

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """


        row = 0
        col = len(matrix[0])-1

        while row <= len(matrix)-1 and col >= 0:

            elem = matrix[row][col]

            if elem == target:
                return True
            elif elem < target:
                row += 1
            else:
                col -= 1



        return False