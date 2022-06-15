class Solution:
    def searchMatrix(self, matrix, target):
        if matrix is None or len(matrix) == 0:
            return false
        m, n = len(matrix), len(matrix[0])
        i, j = 0, n - 1
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1

        return False


if __name__ == "__main__":
    obj = Solution()
    print(obj.searchMatrix(
        [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], 5))

# TC = O(m) + O(n).
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
