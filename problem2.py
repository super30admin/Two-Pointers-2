#Time complexity O(n) and space complexity O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=0
        col=len(matrix[0])-1
 #Traversing to check if the element is greater than the target then decreasing column else incrementing rows      
        while row < len(matrix) and col>=0:
            
            if matrix[row][col]>target:
                col-=1
            elif matrix[row][col]< target:
                row+=1
            else:
                return True
            
        return False
