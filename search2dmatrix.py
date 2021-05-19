class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        '''
        TC : O(m + n)
        SC : O(1)
        Approach : 
        start from the top right corner and check the target with current element 
            if its same return true
            if target is less than element reduce the column 
            if target is greater than element increase the row
            
        or 
        
        start from the bottom left corner and check the target with current element 
            if its same return true
            if target is less than element reduce the row 
            if target is greater than element increase the column
            
        
        '''
        n = len(matrix)
        m = len(matrix[0])
        i = 0
        j = m-1
        
        while i < n and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False
        
#         n = len(matrix)
#         m = len(matrix[0])
#         i = n-1
#         j = 0
        
#         while j < m and i >= 0:
#             if matrix[i][j] == target:
#                 return True
#             elif matrix[i][j] > target:
#                 i -= 1
#             else:
#                 j += 1
#         return False