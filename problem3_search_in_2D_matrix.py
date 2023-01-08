'''
We search from the top corner and eleminate cols if the value is greater than target 
and eleminate rows if the value is lesser than target

TC : O(m+n)
SC : O(1)
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        col = len(matrix[0]) - 1
        row = 0
        
        while(col >=0 and row <= len(matrix)-1):
            if(target == matrix[row][col]):
                return True
            elif (target < matrix[row][col]):
                col -= 1
            elif (target > matrix[row][col]):
                row += 1
        return False