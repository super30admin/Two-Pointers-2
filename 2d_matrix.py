# The code defines a searchMatrix method to search for a target value in a 2D matrix.
# The matrix has sorted rows, and each row is searched using binary search for efficiency.

# Approach:
#   - The outer loop iterates through each row 'i' in the matrix.
#   - For each row, a binary search is performed to check if the target exists in that row:
#       - 'l' is set to the beginning of the row (0), and 'r' is set to the last index of the row (len(matrix[0]) - 1).
#       - While 'l' is less than or equal to 'r':
#           - Calculate the mid-point 'mid' as (l + r) >> 1.
#           - If the element at i[mid] matches the target, return True, indicating the target is found.
#           - If the element at i[mid] is less than the target, narrow the search to the right half by setting l = mid + 1.
#           - If the element at i[mid] is greater than the target, narrow the search to the left half by setting r = mid - 1.
#   - If the target is not found in any row, return False after all rows have been searched.

# Final Result:
#   - The method returns True if the target is found in any row; otherwise, it returns False.

# TC: O(m * log n) - Each row is searched with binary search, where m is the number of rows and n is the number of columns.
# SC: O(1) - The space complexity is constant as only a few pointers are used for binary search.


from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in matrix:
            r=len(matrix[0])-1
            l=0
            while l<=r:
                mid = (l+r)>>1
                if i[mid]==target:
                    return True
                elif i[mid]<target:
                    l=mid+1
                else:
                    r=mid-1
        return False