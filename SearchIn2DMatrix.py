#All TC on leetcode passed

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        #Here we start searching in matrix from top right corner or bottom left corner 
        #as these two elements have nums on either of their side increasing and decreasing. 
        #We run a loop on matrix rows and cols. If cur num>target we decrement column i.e. move left. 
        #If cur num<target we increment row i.e. move downwards. If cur num==target we return True. 
        #If we dont find target after loop completeion we return false.
        #Time complexity - O(m+n)
        #Space complexity - O(1)
        rows = len(matrix)
        cols = len(matrix[0])

        i = 0
        j = cols-1

        while i<rows and j>=0:
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j-=1
            else:
                i+=1
        return False
            
        