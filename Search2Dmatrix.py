
# // Time Complexity :o(logn)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
# idea is to apply binary search and have observation that we can split from top right or bottom left 

# // Your code here along with comments explaining your approach
from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        r,c = 0,n-1
        while c >=0 and r<m:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                r+=1
            else:
                c-=1
        return False

# class Solution:
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         m, n = len(matrix), len(matrix[0])
#         r,c = m-1,0
#         while r >=0 and c<n:
#             if matrix[r][c] == target:
#                 return True
#             elif matrix[r][c] < target:
#                 c+=1
#             else:
#                 r-=1
#         return False

        
