# Time Complexity : O(m + n), where m is the number of rows and n is the number of columns
# Space Complexity : O(1), done in-place without extra space
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        # Optimal Approach - Start from top-right corner
        
        if not matrix or not matrix[0]:
            return False

        rows = len(matrix)
        cols = len(matrix[0])

        row = 0
        col = cols - 1

        while row < rows and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col -= 1
            else:
                row += 1

        return False

#------------------------------------------------------------------------- 

        # Binary Search on rows (Time:O(m * log n), Space: O(1))
         
        # for row in matrix:
        #     low = 0
        #     high = len(matrix[0]) - 1
        #     while low <= high:
        #         mid = (low+high) // 2
        #         if row[mid] == target:
        #             return True
        #         elif row[mid] > target:
        #             high = mid - 1
        #         else:
        #             low = mid + 1
        # return False

#------------------------------------------------------------------------- 

        #Naive Approach - Nested loop (Time: O(m * n), Space: O(1))

        # for row in matrix:
        #     for val in row:
        #         if val == target:
        #             return True
        # return False


if __name__ == "__main__":
    sol = Solution()

    matrix1 = [
        [1, 4, 7, 11, 15],
        [2, 5, 8, 12, 19],
        [3, 6, 9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
    ]
    target1 = 5
    print(sol.searchMatrix(matrix1, target1))  # Output: True

    target2 = 20
    print(sol.searchMatrix(matrix1, target2))  # Output: False