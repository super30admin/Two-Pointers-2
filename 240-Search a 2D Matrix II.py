class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == None: return false
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1
        while(i < m and j >= 0):
            if(matrix[i][j] == target):
                return True
            elif matrix[i][j] > target:
                j-=1
            elif matrix[i][j] < target:
                i+=1
        return False
    
# T.C => O(m + n)
# S.C => O(1)
# Approach => start from either top right or bottom left. consider we started from top right
# let the j be size of row -1 and i be first row.
# If the element us greater that the target move left or if element is smaller then the target move downward. If we found target return True else False.
            
        