#Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
'''
Time Complexity : O(M+N)
Space Complexity : O(1)

'''
'''
Approach : 
start with top right 
check if target is mat[row][col] then return True
check if target is less mat[row][col] then move towards left
check if target is greater mat[row][col] then move towards right
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        m = len(matrix)
        n = len(matrix[0])
        col = n-1
        while(row<m and col>=0):
            if(target == matrix[row][col]):
                return True
            elif(target>matrix[row][col]):
                row = row + 1
            else :
                col = col -1
        return False