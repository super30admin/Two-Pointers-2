# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No..but will have to change this for optimal
#  solution with two pointers



# Your code here along with comments explaining your approach


# class Solution:
# Time Complexity : O(m*n)
# Space Complexity : O(1)
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         """
#         Couple of ideas... 
#             - Just iterate over 2D matrix and find it in m*n time with O(1) space
#             - put all elements in matrix into a 1D matrix and sort it. Then search... O(nLgN) time and  O(m*n) space
#         Not sure if i understand how to utilize the 2D matrix being sorted in the current way...
#         """
#         for i in range(len(matrix)):
#             for j in range(len(matrix[0])):
#                 if matrix[i][j] == target:
#                     return True
                
#         return False


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Couple of ideas... 
            - Just iterate over 2D matrix and find it in m*n time with O(1) space
            - put all elements in matrix into a 1D matrix and sort it. Then search... O(nLgN) time and  O(m*n) space
        Not sure if i understand how to utilize the 2D matrix being sorted in the current way...
        - What I learned in class:
            - Start at the top right or top left 
                - Move in the way that slowly puts you towards the target number
                
        Loop until out of bounds
        """
        
        #start top right
        i = 0
        j = len(matrix[0])-1
        while i < len(matrix) and j >= 0:
            if matrix[i][j] == target:
                return True
            elif target < matrix[i][j]:
                j -= 1
            else:
                i += 1
                
        return False