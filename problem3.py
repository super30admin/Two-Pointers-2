'''
240. Search a 2D Matrix II

TIME COMPLEXITY: O(m+n)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTIES: Nope, although I have watched the class.

'''

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        m = len(matrix)
        n = len(matrix[0])
        i, j = 0, n-1
        
        while i>=0 and j>=0 and i<m and j<n:
            if matrix[i][j] == target:
                return True
            if target > matrix[i][j] :
                i+=1 
            else:
                j-=1
        
        return False
            
