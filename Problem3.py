# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: Search a 2D Matrix II

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # for i in range(len(matrix)):
        #     l, r = 0, len(matrix[0])-1
        #     while l <= r:
        #         mid = (l + r) // 2
        #         if target == matrix[i][mid]:
        #             return True
        #         elif target > matrix[i][mid]:
        #             l = mid + 1
        #         elif target < matrix[i][mid]:
        #             r = mid - 1
        # return False
        
        # N, M = len(matrix), len(matrix[0])
        # r, c = N-1, 0
        # while r >= 0 and c < M:
        #     if matrix[r][c] == target:
        #         return True
        #     if matrix[r][c] < target:
        #         c += 1
        #     else: 
        #         r -= 1
        # return False

        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n - 1
        while r < m and c >= 0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1
        return False        