#TC: O(m+n)
#SC: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ptr1 = 0
        ptr2 = len(matrix[0]) - 1

        while (ptr1 < len(matrix) and ptr2 >= 0):
            if target == matrix[ptr1][ptr2]:
                return True
            elif target < matrix[ptr1][ptr2]:
                ptr2 -= 1
            else:
                ptr1 += 1

        return False
