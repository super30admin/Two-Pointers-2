"Time Complexity is O(M+N)"
"Space Complexity is O(1)"


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        
        r = 0
        c = n-1

        while(r<m and c>=0):
            if (target == matrix[r][c]):
                return True
            elif (target < matrix[r][c]):
                c = c - 1
            else:
                r = r + 1
        
        return False
        