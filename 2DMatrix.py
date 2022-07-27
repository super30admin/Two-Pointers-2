
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution(object):
    def searchMatrix(self, matrix, target):
        m = len(matrix)
        n = len(matrix[0])
        r = m-1
        c = 0
        while (r>=0 and c<n):
            if(target > matrix[r][c]):
                c+=1
            elif(target< matrix[r][c]):
                r -=1
            else:
                return True
        return False