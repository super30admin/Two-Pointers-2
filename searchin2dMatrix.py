'''
Time Complexity -->
O(m+n)

Space Complexity -->
O(1)

Approach -->
we can satrt from 1t row and last column as we know if we move down all te values from that position will be greater and if 
we move left we know all the values from that position will be lesser
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        if m==1 and n==1:
            if target ==matrix[0][0]:
                return True
            else:
                return False
        s = set() # need set to track visited row and column
        i = 0 
        j = n-1
        while i>=0 and i<m and j>=0 and j<n:
            if (i,j) in s:
                return False
            s.add((i,j))
            if matrix[i][j]==target:
                return True
            elif target>matrix[i][j]:
                i+=1
            else:
                j-=1
        return False
    
            