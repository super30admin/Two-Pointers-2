#Time Complexity = O(m+n)
#Space Complexity = O(1)
#Approach = starts at the top-right corner of the matrix and compares the current
#  element with the target. If the element is equal to the target, it returns true; 
# if it is larger, it moves left; otherwise, it moves down. 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return False
        m,n = len(matrix), len(matrix[0])
        i,j = 0, n - 1

        while i < m and j >= 0:
            if matrix[i][j] == target:  # Case 1
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1

        return False
