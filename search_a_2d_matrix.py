# https://leetcode.com/problems/search-a-2d-matrix-ii/

# To find the target element, start checking from the top left corner of the matrix. If the target is less than the current element decrease the column as the matrix is sorted. and if it's greater than the current element increase the row.
# Time Complexity- O(m + n) Space Complexity- O(1)
class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        # starting from the top-right corner
        r, c = 0 , n - 1
        
        while r < m and c >= 0:
            # if the target is present at this coordinate
            if matrix[r][c] == target:
                return True
            # if the target is less than the element
            elif matrix[r][c] > target:
                # decrement the column
                c -= 1
            else:
                # increment the row 
                r += 1

        return False
        
solution = Solution()
print(solution.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 19))

# target = 5
# output = true
