#search 2-d Matrix 2:
#Time Complexity: O(m+n) where m and n are row and col sizes
#space complexity: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #edge case check
        if len(matrix)==0:
            return False
        
        height = len(matrix)
        width = len(matrix[0])
        
        #pointer at bottom left
        row = height-1
        col = 0
        while col< width and row>=0:
            if matrix[row][col]>target:
                row-=1
            elif matrix[row][col]<target:
                col+=1
            else:#found
                return True
            
        return False
        