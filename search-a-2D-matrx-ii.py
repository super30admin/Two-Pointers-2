'''
Time complexity: o(m+n)
Space complexity: O(1)
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row_pointer = 0
        col_pointer = len(matrix[0]) - 1

        while (row_pointer >=0 and row_pointer <len(matrix)) and (col_pointer >=0 and col_pointer <len(matrix[0])):
            if matrix[row_pointer][col_pointer] == target:
                return True
            elif matrix[row_pointer][col_pointer] > target:
                col_pointer -= 1
            else:
                row_pointer +=1 
        return False
        