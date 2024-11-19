# // Time Complexity :O(m+n) for matrix(|_)
# // Space Complexity :O(1) for no aux space
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Since we know that all elements from left to right and top to bottom are ascending we can chose either anti-diagonal edge and play stairs.
# Our output is boolean so, only if target is found do we return true otherwise false.
# We will keep comparing item at our pointer with the target and move row or column.

# // Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        r = m-1  #or 0
        c = 0    #or n-1

        while (r >= 0 and c < n):           #if row, column in matrix bounds
            if target == matrix[r][c]:      #target found
                return True
            elif target < matrix[r][c]:     # target less than item at current pointer
                r -=1
            else:                           # target greter than item ar current pointer
                c+=1
        return False     
    
matx = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
print(Solution().searchMatrix(matx,10))