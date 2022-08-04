# Time Complexity : O(m+n) for optimal soln
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Brute Force: O(m*n): Iterate through all elements
        
        ########## Optimal Solution: 2 ptrs (using 1 ptr actually) O(m+n) time and O(1) space #########
        
#         m = len(matrix)
#         n = len(matrix[0])
#         row = 0
#         column = n-1 # We start at either 
        
#         while(row >= 0 and row < m and column>=0 and column < n):
#             if matrix[row][column] == target:
#                 return True  # Return True if found the target
#             elif target > matrix[row][column]:
#                 row += 1 # If target is greater than current element move down to the next row as that element is greater than current element
#             else:
#                 column -= 1 # If target is lesser than current element move left to the previous column as that element is lesser than current element
#         return False # Return False if we couldn't find the element
        
        ############ Binary search Solution : O(m log n) time and O(1) space complexity ############
        m = len(matrix)
        n = len(matrix[0])
        
        for i in range(m):
            if target >= matrix[i][0] and target <= matrix[i][n-1]: # See if target lies in this row or not
            # Perform Binary search in each row that target might be in
                # print('hi')
                low = 0
                high = n-1

                while(low <= high):
                    mid = low + (high-low)//2
                    if matrix[i][mid] == target:
                        return True
                    elif matrix[i][mid] < target:
                        low = mid+1
                    else:
                        high = mid-1
        return False
        