# Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

# TC : O(m + n) where m is the number of rows and n is the number of columns

# SC : O(1)

# Approach:
    # Start from the top-right corner (we could also start from bottom-left)
    # If the current element is greater than the target, move left (smaller values)
    # If the current element is less than the target, move down (larger values)
    # If we find the target, return True
    # If we go out of bounds, return False

# Did this code successfully run on Leetcode : YES

def searchMatrix(self, matrix, target):
    if not matrix or not matrix[0]:
        return False
    
    rows, cols = len(matrix), len(matrix[0])
    
    # Start from top-right corner
    row, col = 0, cols - 1
    
    while row < rows and col >= 0:
        current = matrix[row][col]
        
        if current == target:
            return True
        elif current > target:
            # If current element is greater than target, move left
            col -= 1
        else:
            # If current element is less than target, move down
            row += 1
            
    return False