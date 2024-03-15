# Time complexity is O(MN) and space complexity is O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        N = len(matrix)
        M = len(matrix[0])
        
        row = N-1
        col =0
        
        while row>=0 and col<M:
            if matrix[row][col] == target:
                return True
            
            if matrix[row][col] < target:
                row-=1
            else:
                col+=1
        return False
        