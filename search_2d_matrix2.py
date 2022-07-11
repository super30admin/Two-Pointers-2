# Time complexity: O(m+n)
# Space Complexity: O(1)
# Approach: start from top right corner index
# if target is less than the element, decrement col 
# if target is greater, increment row
# if found target, return True
# run this loop until boundary cases.
# if out of lopp- that means target not found, return false.


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix)==0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        row = 0
        col = n-1
        while(row< m and col >=0):
            if target > matrix[row][col]:
                row = row + 1
            elif target < matrix[row][col]:
                col = col - 1
            else:
                return True
        return False
        