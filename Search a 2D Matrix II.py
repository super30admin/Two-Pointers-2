# Time Complexity :  O(m+n) (num rows + num cols)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = len(matrix) - 1
        j = 0
        while i >= 0 and j < len(matrix[0]):
            if matrix[i][j] == target:
                return True
            if matrix[i][j] > target:
                i-=1
            else:
                j+=1
        return False
            