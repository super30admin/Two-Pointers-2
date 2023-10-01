'''
1. We start from the bottom left corner as we can definitely move in one of the two directions from here.
2. If the element at the current position is greater than the target, we move up one row.
3. If the element at the current position is less than the target, we move right one column.
4. If the element at the current position is equal to the target, we return True.

TC: O(m+n)
SC: O(1)
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)-1
        col = 0

        while(row>=0 and col<=len(matrix[0])-1):
            element = matrix[row][col]
            if element > target:
                row -= 1
            elif element < target:
                col += 1
            else:
                return True
        return False