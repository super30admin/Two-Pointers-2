# Time : O(m+n)
# Space: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix[0])
        m = len(matrix)
        i = m - 1
        j = 0
        while 0 <= i < m and 0 <= j < n:
            if matrix[i][j] == target: 
                return True
            if matrix[i][j] > target:
                i -= 1
            if matrix[i][j] < target:
                j += 1
        return False

 # Time: O(m * n log n), n: cols m: rows
 # Space: O(1)   
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix[0])
        m = len(matrix)
        for i in range(m):
            if matrix[i][0] <= target <= matrix[i][-1]:
                if self.binarySearch(matrix, i, n, target): return True
        return False

    def binarySearch(self, matrix: List[List[int]], i: int, n: int, target: int) -> bool:
        l = 0
        r = n-1
        while l <= r:
            mid = l + (r-l) // 2
            if matrix[i][mid] == target:
                return True
            if matrix[i][mid] > target:
                r = mid - 1
            else:
                l = mid + 1
        return False