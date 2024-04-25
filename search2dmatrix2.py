
# // Time Complexity : O(m*n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach



class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        n = len(matrix)
        m = len(matrix[0])
        row , col = 0 , m-1

        while row < n and col >= 0 :

            if matrix[row][col] == target:
                return True
            elif matrix[row] [col] < target:
                row += 1
            else:
                col -= 1
        return False

