"""

Time Complexity : inside function
Space Complexity : inside function
Did this code successfully run on Leetcode : yes

Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

"""

# Approach - 1

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Using binary search at each row to find the target
        Time Complexity : O(m logn) where m is the number of rows and n is the cols
        Space Complexity : O(1)
        """
        if len(matrix) == 0: return False
        res = False
        
        m = len(matrix)
        for i in range(m):
            res =  self.search_each_row(matrix[i], target)
            if res == True:
                return res
            
        return res
        
    def search_each_row(self, matrix, target):
        
        pt1, pt2 = 0, len(matrix) - 1
        
        while pt1 <= pt2:
            mid = (pt1 + pt2)//2
            
            if matrix[mid] == target:
                return True
            elif target > matrix[mid]:
                pt1 += 1
            else:
                pt2 -= 1
                
        return False

# Approach - 2
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Using two pointers to search the target.We will be starting from the top right corner.
        if the target is less than the current matrix value than we will move the
        col else the row. 
        Time Complexity : O(m + n) where m is the number of rows and n is the cols
        Space Complexity : O(1)
        """
        if len(matrix) == 0: return False 
        m = len(matrix)
        n = len(matrix[0])
        row, col = 0, n - 1
        
        while (row < m and col >= 0):
            if matrix[row][col] == target:
                return True
            
            elif matrix[row][col] > target:
                col -= 1
                
            else :
                row += 1
                
        return False
                
            
        
        
                
                
        