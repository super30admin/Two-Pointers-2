# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def searchMatrix(self, matrix, target):
        
        l = 0
        r = len(matrix[0])-1

        while l<r:
            if target==matrix[l][r]:
                return True
            if matrix[l][r]<target:
                r += 1          # go down in column
            else:
                l -= 1          # go left in row
        return False