""""// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
#TopBottom
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1
        while (i < m and j >= 0):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False

#BottomTop
# class Solution:
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         m= len(matrix)
#         n=len(matrix[0])
#         i=m-1
#         j=0
#         while(i>=0 and j<n):
#             if matrix[i][j]==target:
#                 return True
#             elif matrix[i][j]>target:
#                 i-=1
#             else:
#                 j+=1
#         return False

""""// Time Complexity : O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
#Binary Search-
# class Solution:
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         m = len(matrix)
#         n = len(matrix[0])
#         l = 0
#         r = n - 1
#
#         for i in range(m):
#             l = 0
#             r = n - 1
#             while l <= r:
#                 mid = l + (r - l) // 2
#                 if matrix[i][mid] == target:
#                     return True
#                 if matrix[i][mid] > target:
#                     r = mid - 1
#                 else:
#                     l = mid + 1
#         return False