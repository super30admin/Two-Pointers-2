# APPROACH 1: BRUTE FORCE
# Time Complexity : O(n*m), n: number of rows of matrix and m: number of columns of matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Scan through all rows and columns to find target.
# 2.  If reached the end of matrix -> target is not present
# 3.

class Solution:

    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix is None or len(matrix) <= 0 or len(matrix[0]) <= 0:
            return False
        
        for row in range(len(matrix)):
            for column in range(len(matrix[0])):
                if matrix[row][column] == target:
                    return True
                
        return False
        
        
  
  
# APPROACH 2: INTERMEDIATE - 1
# Time Complexity : O(n lg m), n: number of rows of matrix and m: number of columns of matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Do binary search for each row of the matrix. 
# 2. If all rows are done -> target not present
# 3.

class Solution:
    def binarySearch(self, matrix, row, target):
        start, end = 0, len(matrix[row]) - 1
        
        while start <= end:
            mid = start + (end - start) // 2
            if matrix[row][mid] == target:
                return True
            elif matrix[row][mid] > target:
                end = mid - 1
            else:
                start = mid + 1
                
        return False
    
    
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix is None or len(matrix) <= 0 or len(matrix[0]) <= 0:
            return False
        
        for row in range(len(matrix)):
            if matrix[row][0] <= target and matrix[row][-1] >= target:
                if self.binarySearch(matrix, row, target):
                    return True
                
        return False
        
        
        
        
  
# APPROACH  3: INTERMEDIATE 2
# Time Complexity : O(lg (min (n, m) !) ( < O(n lg n) ) - each time do 2 binary search - horizontal and vertical, and do min(n, m) along the diagonal
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Take starting point along the diagonal
# 2. Do 2 binary search - in row starting from (start element) and column starting from (start element)
# 3. If end of diagonal reached, -> target not found

  class Solution:
    
    def vertical_search(self, matrix, target, pos):
        start, end = pos, len(matrix) - 1
        while start <= end:
            mid = start + (end - start) // 2
            if matrix[mid][pos] == target:
                return True
            elif matrix[mid][pos] > target:
                end = mid - 1
            else:
                start = mid + 1
        return False
    
    def horizontal_search(self, matrix, target, pos):
        start, end = pos, len(matrix[0]) - 1
        while start <= end:
            mid = start + (end - start) // 2
            print(start, end, mid)
            if matrix[pos][mid] == target:
                return True
            elif matrix[pos][mid] > target:
                end = mid - 1
            else:
                start = mid + 1
        return False

    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix is None or len(matrix) <= 0 or len(matrix[0]) <= 0:
            return False
        
        for count in range(min(len(matrix), len(matrix[0]))):
            vertical_search = self.vertical_search(matrix, target, count)
            horizontal_search = self.horizontal_search(matrix, target, count)
            
            if vertical_search or horizontal_search:
                return True
        
        return False
        
        
        
        
        
 
# APPROACH 4: OPTIMAL SOLUTION
# Time Complexity : O(n + m), n: number of rows of matrix and m: number of columns of matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Start from left bottom (or top right)
# 2. If element < target -> go right as all elements above it will be less than target definitely as column is sorted from top to bottom in acending order . since row is sorted 
#    from left to right will definitely find greater elements to right of current elements
# 3. Similarly if element > target -> go top as all elements to the right of it will be greater than target definitely as row is sorted from left to right in acending order. 
#     since column is sorted from top to bottom, going top means you will definitely find elements lesser than the current one.

  class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix is None:
            return False
        
        row, column = len(matrix) - 1, 0
        
        while row >= 0 and column <= len(matrix[0]) - 1:
            
            if matrix[row][column] == target:
                return True
            
            # need to move top as all elements to the right of it will be greater than target definitely as row is sorted from left to right in acending order   
            elif matrix[row][column] > target:
                row -= 1
            
            # need to move right as all elements above it will be less than target definitely as column is sorted from top to bottom in acending order   
            elif matrix[row][column] < target:
                column += 1
                
        return False
        
