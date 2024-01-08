#time complexity :  O(m + n), where m is the number of rows and n is the number of columns in the matrix.
#space complexity : O(1)
#submit on leetcode: yes

class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        i = len(matrix) - 1
        j = 0

        while i >= 0 and j < len(matrix[0]):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                j += 1
            else:
                i -= 1
        return False

solution = Solution()

matrix = [
            [1, 4, 7, 11],
            [2, 5, 8, 12],
            [3, 6, 9, 16],
            [10, 13, 14, 17]
        ]

target = 5

result = solution.searchMatrix(matrix, target)

if result:
    print(f'Target {target} found in the matrix.')
else:
    print(f'Target {target} not found in the matrix.')
    
    
    