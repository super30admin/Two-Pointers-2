# Time Complexity : O(M+N) where M is number of rows and N is number of columns in the matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])
        r, c = 0, COLS - 1
        
        while c >= 0 and r < ROWS:
            if matrix[r][c] == target:
                    return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r +=  1
                            
        return False

solution = Solution()
print(f'OUTPUT >> {solution.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5)}')