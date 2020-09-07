"""
240. Search a 2D Matrix II

Write an efficient algorithm that searches for a value in an m x n matrix. 


Time = O(mn), m = number of rows , n = number of coloumns
Space = constant = O(1)
Successfully excecuted on leetcode

Approach ---
1. Starting from top right corner, if current cell value is smaller than target, there is no need to search in that row so increase the row
2. We keep increasing the row until it's cell value is larger than target. Then safely move leftwards by decrasing coloumn index
3. During the search if we find target, return True. If we reach bottom-left cell, return False

"""
class Search:
    def searchMatrix(matrix,target):
        if not matrix:
            return False
        m = len(matrix)
        n = len(matrix[0])
        row = 0
        col = n-1
        while row<m and col>=0:
            if target> matrix[row][col]:
                row += 1
            elif target < matrix[row][col]:
                col -= 1
            else:
                return True
        return False