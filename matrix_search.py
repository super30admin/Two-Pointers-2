# Time Complexity :
# O(N+M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#We start from one corner. If our current value is larger than the target, then we move towards the smaller value in the matrix
#If the current value is saller than the target, then we move towarsd the larger value in the matrix
#Since the rows and columns are sorted, we always know which direction to move in

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0 
        j = len(matrix[0]) -1

        while (i < len(matrix) and j >= 0 ):
            if matrix[i][j] == target :
                return True

            if matrix[i][j] < target:
                i += 1
            else :
                j -= 1
