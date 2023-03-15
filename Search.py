# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
#begin at matrix[0][col], if target is less than that, it cant be in col c,so decrease c by one,
#if target is greater than the current element, it cant be on its left, and also right, so increase row by 1

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        col = len(matrix[0])
        r = 0
        c = col - 1
        while c>=0 and c< col and r>=0 and r<rows:
            if matrix[r][c] == target:
                return True
            elif  matrix[r][c] > target:
                c-=1
            else:
                r+=1
        return False

