"""
Name: Srinidhi
Time Complexity: O(mn) - max(O(m),O(n))
Space Complexity: O(1) - no extra space

Did it run on LC: Yes
Logic:
Reduce the search space - we know it is sorted in form of rows and cols
in matrix
Start with the bottom most element on the left side. Try to find the best row
where we must search and then compare with last element in column 
"""
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if len(matrix)==0 or len(matrix[0]) == 0:
            return False
        
        length = len(matrix)
        width = len(matrix[0])
        
        start_row = length - 1 
        start_col = 0
        
        while start_row >=0 and start_col < width:
            if matrix[start_row][start_col] > target:
                start_row-=1
                
            elif matrix[start_row][start_col] < target:
                start_col+=1
                
            else:
                return True
        
        return False