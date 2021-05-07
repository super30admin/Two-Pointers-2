class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        m = len(matrix)-1
        n = len(matrix[0]) - 1
        r,c =0, n
        
        while r<=m and c>=0:
            
            if matrix[r][c] == target:
                return True
            
            elif matrix[r][c] > target:
                c-=1
                
            else:
                r+=1
        
        return False

#  time complexity is O(n+m)
#  Approach is to take pointer either at first element of the last column or last element of the first column
#  I have take first element of the last row, i am decreasing that pointer till I find value less that target, once that value is found, I am iterating that entire column
        
