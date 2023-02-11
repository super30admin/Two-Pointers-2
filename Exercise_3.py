#Time Complexity : O(M+N), M being the length of the array and N width. 
#Space Complexity : O(M+N), M being the length of the array and N width. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Mixed the direction of the search initially.

#Your code here along with comments explaining your approach in three sentences only
'''Starting from the edge of the matrix that is not the lowest of highest, increment
or decrement the indices as needed until target is found. Or, if not found, return 
false.  
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #initialize the indices. 
        rows = len(matrix)
        cols = len(matrix[0])

        i=0
        j=cols-1

        #increment/decrement if target isn't found. 
        while(i<rows and j>=0):
            current = matrix[i][j]
            if current>target:
                j = j-1
            elif current<target:
                i = i+1
            else:
                return True

        return False