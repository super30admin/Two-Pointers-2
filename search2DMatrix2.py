class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # TC : O(m+n)
        # SC : O(1)
        if matrix is None or len(matrix) == 0:
            return False
        m,n = len(matrix),len(matrix[0])
        # start from top right corner . we can only go left,bottom
        row,col = 0,n-1
        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row += 1
            else:
                col -= 1
        return False
        