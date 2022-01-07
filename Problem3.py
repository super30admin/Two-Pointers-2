# Time Complexity : O(m + n) where m,n is the length of matrix.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Class Solution.
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0
        j = len(matrix[0])-1
        while(i< len(matrix) and j >= 0):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
                
            else:
                i += 1
        return False
