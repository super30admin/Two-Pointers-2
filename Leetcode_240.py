#Time Complexity: O(m+n)
#Space Complexity: O(1)


class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        if not matrix or not matrix[0]:
            return False
        rows, cols=len(matrix), len(matrix[0])
        r,c = 0, cols-1
        
        while r<rows and c>=0:
            if matrix[r][c]==target:
                return True
            if target>matrix[r][c]:
                r+=1
            else:
                c-=1
        return False