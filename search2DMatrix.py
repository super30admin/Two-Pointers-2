class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        """
        TC: O(r + c)
        SC: O(1)
        """
        
        # 1. Base Case
        if matrix == None or len(matrix) == 0:
            return False
        
        # 2. when matrix is not empty
        
        r, c = len(matrix), len(matrix[0])
        i, j = 0, c - 1
        
        while i >= 0 and j >= 0 and i < r and j < c:
            
            # move to the left
            if target < matrix[i][j]:
                j -= 1
            # move down
            elif target > matrix[i][j]:
                i += 1
            # otherwise return true
            else:
                return True
        
        return False