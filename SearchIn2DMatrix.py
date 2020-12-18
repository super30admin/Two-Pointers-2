# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/
# Apporach: What we will do is we will select one of the 4 corners as a starting point. 

# Top right corner as a start
# Now according of the nature of the matrix, we will find elements lower than the current corner element towards left and higher than it towards bottom. That means if the target is greater than the current element then we need to move down else we need to move left. So at each point until we reach the target we will move through the matrix in left-bottom fashion.

# Bottom left corner as a start
# Now according of the nature of the matrix, we will find elements lower than the current corner element towards top and higher than it towards right. That means if the target is greater than the current element then we need to move right else we need to move top. So at each point until we reach the target we will move through the matrix in top-right fashion.

# Note: top left and bottom right corners are not suitable as starting point because all the elements are either greater or smaller than the corner element. So we wont be able to fixate on the direction (Try it yourself).

# Time complexity: O(m+n)
# Space complexity: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix) == 0:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1
        
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1
                
        return False
        
        