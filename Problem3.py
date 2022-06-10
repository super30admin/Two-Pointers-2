# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# bottom-left
class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        n = len(matrix[-1])
        i, j = len(matrix)-1, 0
        while i >= 0 and j < n:
            if matrix[i][j] == target:
                return True
            if matrix[i][j] > target:
                i -= 1
            else:
                j += 1
        return False


check = Solution()
print(check.searchMatrix([[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], 5))


# # top - right.
# class Solution:
#     def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
#         m = len(matrix)
#         i, j = 0, len(matrix[-1])-1
#         while i < m and j >= 0:
#             if matrix[i][j] == target:
#                 return True
#             if matrix[i][j] > target:
#                 j -= 1
#             else:
#                 i += 1
#         return False
#
#
# check = Solution()
# print(check.searchMatrix([[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], 5))


# Binary Search - TC - O(n*log(n)); SC - O(1)
# class Solution:
#     def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
#         for i in matrix:
#             if target > i[-1]:
#                 continue
#             else:
#                 start = 0
#                 end = len(i)-1
#                 while start <= end:
#                     mid = start + (end-start)//2
#                     if i[mid] == target:
#                         return True
#                     elif i[mid] > target:
#                         end = mid - 1
#                     else:
#                         start = mid + 1
#         return False
#
#
# check = Solution()
# print(check.searchMatrix([[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], -5))
