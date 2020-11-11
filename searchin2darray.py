# // Time Complexity : O(M+N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
"""
Starting at the bottom left, we have two choices. If our current element is greater than the target, we need to go up.
If our current element is less than the target, we then go to the right. This only works if we start from the bottom left.
"""
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)-1
        n = 0
        
        while(m >= 0 and n <= len(matrix[0]) - 1):
            if(matrix[m][n] > target):
                m -= 1
            elif(matrix[m][n] < target):
                n += 1
            else:
                return True
                
        return False
            
        
        
        