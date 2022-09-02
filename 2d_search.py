# // Time Complexity : O(m+n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach



class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        i=0
        #Start from the right
        j=n-1
        
        while (i<m and j>=0):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j-=1
            else:
                i+=1
        
        return False 