// Time Complexity :(m+n)   
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Start searching from the left-down corner. if the element matches the target return True, if the element is greater than target move towards
// the upper row and if the element is less than the target move towards the right column

class Solution(object):
    def searchMatrix(self, matrix, target):
        
        if(len(matrix) == 0 ):
            
            return False
        rows = len(matrix)
        cols = len(matrix[0])
        i = rows - 1
        j = 0

        while (i >= 0 and j <= cols-1):
            if (matrix[i][j] == target):
                return True
            elif (matrix[i][j] > target):
                i = i-1
            else:
                j = j+1


        return False
