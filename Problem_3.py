class Solution:
    """
    Exhausted Approach
    TC - O(mn)
    Sc - O(1)
    """

    def approach1(self, matrix, target) -> bool:
        for i in matrix:
            for j in i:
                if j is target:
                    return True
        return False

    """
    Two pointer Appraoch
    TC - O(n)
    SC - O(1)
    """

    def approach2(self, matrix, target):
        m = len(matrix)
        n = len(matrix[0])
        i, j = 0, n - 1
        while (j >= 0 and i < m):
            if matrix[i][j] == target:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1
        return False

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix is None or not matrix:
            return False
        return self.approach1(matrix, target)
