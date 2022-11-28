class Solution:
    """
    Time complexity - O(n+m). n - no of rows, m - no of cols
    Space complexity - O(1)
    """
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        i = 0
        j = 0
        m = len(matrix)
        n = len(matrix[0])
        while j < n and j >= 0 and i >= 0 and i < m:
            #print(i,j)
            if target == matrix[i][j]:
                return True 
            # move left and down
            elif j > 0 and target > matrix[i][j-1] and target < matrix[i][j]:
                if i == m-1:
                    return False
                i += 1
                j -= 1
            # move down
            elif j == n-1 and target > matrix[i][j]:
                i += 1
            # move left
            elif i == m-1 and target < matrix[i][j]:
                j -= 1
            # move right
            elif target > matrix[i][j]:
                j += 1
            # move left
            elif target < matrix[i][j]:
                j -= 1
            
        return False
            
        