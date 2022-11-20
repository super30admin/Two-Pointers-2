#Time complexity: O(m + n)
#Space complexity: O(1)

#Accepted on Leetcode

#Approach
# Start from either top right corner - at each index left element is smaller and downward element is larger
# Thus, if element found, return it else move to the correct direction depending on the target
# Keep moving until rows/cols out of bounds (element not found) - will also work if we start at bottom left index

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix)
        m = len(matrix[0])
        i = 0
        j = m-1
        A = matrix

        while j >= 0 and i < n:
            if A[i][j] == target:
                return True
            elif A[i][j] < target:
                i+=1
            else:
                j-=1

        return False
