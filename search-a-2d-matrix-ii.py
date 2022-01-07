# Time Complexity: O(m+n)
# Space Complexity: O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
# Class Approach
        m = len(matrix)
        n = len(matrix[0])
        row_start = 0
        col_start = n-1
        while row_start < m and col_start >= 0:
            if matrix[row_start][col_start] == target:
                return True
            elif matrix[row_start][col_start] < target:
                row_start += 1
            else:
                col_start -= 1
        return False
# My Approach
#         def binarySearch(target, row):
#             left, right = 0, len(row)-1
#             while left <= right:
#                 mid = (left + right)//2
#                 if row[mid] == target: return True
#                 elif row[mid] < target: left = mid + 1
#                 else: right = mid - 1
#             return False

#         def arrSearch(target, search_arr):
#             left, right = 0, len(search_arr)-1
#             while left <= right:
#                 mid = (left+right)//2
#                 if search_arr[mid] <= target: left = mid+1
#                 else: right = mid-1
#             return right
        
#         return binarySearch(target, matrix[arrSearch(target, [row[0] for row in matrix])])