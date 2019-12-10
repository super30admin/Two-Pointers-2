#time complexity = O(n+m)
#space complexity = O(1)

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        ptr1 = len(matrix)-1
        ptr2 = 0
        while (ptr1 >= 0 and ptr2 <= len(matrix[0])-1):
            if target == matrix[ptr1][ptr2]:
                return True
            elif target > matrix[ptr1][ptr2]:
                ptr2 += 1
            else:
                ptr1 -= 1
        return False