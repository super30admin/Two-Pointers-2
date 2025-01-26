class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        # Start from row index i = 0
        # Start from col index j = len(matrix[i])-1
        # Perform bottom-left-right check
        
        i = 0
        j = len(matrix[i])-1
        
        while (i > -1 and i < len(matrix)) and (j > -1 and j < len(matrix[0])):
            
            # current ele to compare with
            currentEle = matrix[i][j]
            
            if target == currentEle:
                return True
            
            elif target < currentEle:
                # Navigate to same row i, col will be j-1
                j -=1
                
            else:
                # Navigate to row+1 , col will be same
                i +=1
            
            continue
        
        return False
                