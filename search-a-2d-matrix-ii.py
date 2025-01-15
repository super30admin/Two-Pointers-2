# Time Complexity : O(m+n)  
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english: Matrix traversal is performed using two pointer solution approach.
# Traversal is performed in two directions and if current element is greater then target we increase the col
# until row < total no of rows and column >= 0 - since we start the traversal from element in the first row last column
#restricting the directions to two sides only. 

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return False
        
        m, n = len(matrix), len(matrix[0])
        row, col = 0, n-1

        while row <= m-1 and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col -= 1
            else:
                row += 1
        return False