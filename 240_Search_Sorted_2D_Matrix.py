# Leetcode problem link : https://leetcode.com/problems/search-a-2d-matrix-ii/
# Time Complexity : O(n+m)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n*m) => Traverse through all the elements in the array like usually and search for the target.

        Optimized approach: O( n+m ) => 1. Start from last row and first column as it will give us a direction to move
        2. If current element is less than target then it should be present in a column to the right so we increase column pointer
        3. If current element is greater than target then it will definitely be present in rows above as all elements in thsi row and next will be bigger
        4. if element is found break and return. If not found then keep tarversing till first row and last column. return false at the end
'''
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # edge case
        if not matrix or len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        # intialize row and column
        row = len(matrix)
        col = len(matrix[0])
        # 1
        i = row - 1
        j = 0
        
        #4
        while i >= 0 and j < col:
            # 2
            if matrix[i][j] < target:
                j += 1
            # 3
            elif matrix[i][j] > target:
                i -= 1
            # 4
            else:
                return True
        return False
#         row = self.getRowBound(matrix,target)
#         col = self.getColumnBound(matrix,target)
#         i = 0
#         while i>= 0 and i< row:
#             low = 0
#             high = col
#             while low <= high:
#                 mid = low + (high-low)//2
#                 if matrix[i][mid] == target:
#                     return True
#                 elif matrix[i][mid] > target:
#                     low = mid + 1
#                 else:
#                     high = mid - 1
#         return False
    
#     def getRowBound(self,matrix,target):
#         low = 0
#         high = len(matrix) - 1
#         while low <= high:
#             mid = low + (high - low)//2
#             if matrix[mid][0] - target > 0:
#                 high = mid - 1
#             elif matrix[mid][0] - target < 0:
#                 low = mid + 1
#         return mid
        
#     def getColumnBound(self,matrix,target):
#         low = 0
#         high = len(matrix[0]) - 1
#         while low <= high:
#             mid = low + (high - low)//2
#             if matrix[0][mid] - target > 0:
#                 high = mid - 1
#             elif matrix[0][mid] - target < 0:
#                 low = mid + 1
#         return mid
        