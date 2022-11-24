class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        ## T.C = O(m+n)
        ## S.C = O(1)
        
        m = len(matrix)
        row = 0
        col = len(matrix[0]) - 1

        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row += 1
            else:
                col -= 1

        return False