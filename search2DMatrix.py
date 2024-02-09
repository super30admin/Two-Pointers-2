"""
Time Complexity : O(m+n), m rows and n cols
Space Complexity : O(1)
Did this code successfully run on Leetcode :  yes
Three line explanation of solution in plain english
Use the fact that both rows and cols are sorted and start from either the top right element or bottom left element and compare with target
based on the comparition we either move towards the target (compating with the current value with target we know if we which direction to move)
stop when target is found or we breach either hte rows or colums 

// Your code here along with comments explaining your approach
"""


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r = len(matrix)
        c = len(matrix[0])
        r1 = 0
        c1 = c - 1
        while r1 < r and c1 >= 0:
            if matrix[r1][c1] == target:
                return True
            elif matrix[r1][c1] < target:
                r1 += 1
            else:
                c1 -= 1
        return False
