#Time Complexity : O(m+n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to maintain two pointers - one to navigate the row and the other to navigate the column. if the target is greater than the element at the current position, we change the row or else we change the column accordingly.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        
        i, j = 0, n - 1
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            else:
                if matrix[i][j] < target:
                    i += 1
                else:
                    j -= 1
        return False
