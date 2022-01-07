# // Time Complexity : O(n Log n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Followed approach from class
# // Your code here along with comments explaining your approach
# Search in a 2D matrix
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix)
        m = len(matrix[0])
        
        # starting with last element of 1st row
        row = 0
        col = m-1
        
        while row<n and col>=0:
            element = matrix[row][col]
            
            # if target is larger than current element than search in next row
            if element<target:
                row+=1
            
            # else search in previous columns for lesser value
            elif element>target:
                col-=1
                
            else:
                return True
        
        return False