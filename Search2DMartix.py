# Time Complexity : O(m+n) in worst case
# Space Complexity : O(1)

# The code ran on LeetCode

# Start at top right corner of the matrix and discard either a row a column based on the current value and target

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        m = len(matrix); n = len(matrix[0])

        i = 0; j = n-1

        while i <= m-1 and j >= 0:

            # Discard column if current element < target
            # Discard row if current element > target
            if matrix[i][j] > target:
                j-=1
            elif matrix[i][j] < target:
                i+=1
            else:
                return True

        return False