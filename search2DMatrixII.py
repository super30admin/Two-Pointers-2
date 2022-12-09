
#Time Complexity :  O(m+n)
#Space Complexity :  O(1)
#Did this code successfully run on Leetcode : Yes

#code along with comments 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0: return False         #base case check
        m = len(matrix)-1
        n = len(matrix[0])-1
        i = 0                                                   #starting i and j at top right
        j = n                                                   #corner
        while i<=m and j>=0:                                    #while i and j are in bounds
            if matrix[i][j] == target:                          #if we find the target we return True
                return True
            elif matrix[i][j] < target:                         #if elem at matrix[i][j] < target
                i += 1                                          #we move down by incrementing i
            else:                                               #else we move left 
                j -= 1                                          #by decrementing j
        return False                                            #if dont find target we return False
