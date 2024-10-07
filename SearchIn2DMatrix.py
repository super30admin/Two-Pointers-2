# Time Complexity : O(m+n) You start from the bottom-left corner and move right (increment column) or up (decrement row)
# Space Complexity : O(1)  No extra space is created
# Did this code successfully run on Leetcode : Yes

# Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #Assign required variables
        m = len(matrix)
        n = len(matrix[0])
        #Start the serach from last row and first column
        r = m-1
        c = 0
        #To make sure the matrix doesn't go out of bound index
        while(r>=0 and c<n):
            #If target found, Return True
            if(matrix[r][c]==target):
                return True
            #If the target is greater than current element, increment column
            elif(matrix[r][c]<target):
                c+=1
            #If target is smaller than current element, decrement row
            else:
                r-=1
        #If element not present in the matrix, return False
        return False
        