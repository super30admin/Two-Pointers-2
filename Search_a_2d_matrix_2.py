# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
#I have used the top right element to start searching for the element in matrix since the elements or row and column are sorted
#We can also start from bottom left element
#When we find the target we will return true or if the target is less than element then move left so decrement col and if it is greater then move down increment row


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        row = 0
        col = n-1
        while row <= m-1 and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row += 1
            else:
                col -= 1
        return False