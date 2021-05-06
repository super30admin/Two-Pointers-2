"""Search a 2D Matrix II
Time Complexity: O(m+n)
Space Complexity - O(1)

approach - 2 pointers. Start from top right corner (towards down / towards left the numbers are decreasing) or bottom left corner (towards ) """
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix ==None and len(matrix)==0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        #start from top right corner
        r = 0
        c = n-1
        while (r< m and c>=0):
            if matrix[r][c]== target:
                return True
            if matrix[r][c]<target:
                r+=1
            else:
                c-=1
        return False
                
        
        