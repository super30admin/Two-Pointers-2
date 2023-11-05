#TC: O(n+m), n is no of rows, m is no of cols
#SC: O(1)

#starting at bottom left
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #null check
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False

        # no of rows, cols
        nr = len(matrix)
        nc = len(matrix[0])

        # start our "pointer" in the bottom-left
        row = nr - 1
        col = 0

        while col < nc and row >= 0:
            if matrix[row][col] > target:
                row -= 1
            elif matrix[row][col] < target:
                col += 1
            else: # found it
                return True
        
        return False
    
#TC: O(n+m), n is no of rows, m is no of cols
#SC: O(1)

#starting at top right
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #null check 
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        
        nr = len(matrix)
        nc = len(matrix[0])
        
        top = 0
        right = nc - 1
        
        while top < nc and right >= 0:
            if matrix[top][right] > target:
                right -= 1
                
            elif matrix[top][right] < target:
                top += 1
                
            else:
                return True
        return False
        