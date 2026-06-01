class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        
        row = -1
        for i in range(m):
            if matrix[i][n - 1] >= target:
                row = i
                break
        
        if row == -1:
            return False

        low, high = 0, n - 1
        while low <= high:
            mid = low + (high - low) // 2
            if matrix[row][mid] == target:
                return True
            elif matrix[row][mid] > target:
                high = mid - 1
            else:
                low = mid + 1

        return False

# Time: O(m + log n)
# Space: O(1)