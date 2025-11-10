# Find the target given that rows and cols are in ascending order

# Time: O(m * n)
# Space: O(1)
# Brute force just go through each and every element checking for the target

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)
        col = len(matrix[0])
        for m in range(row):
            for n in range(col):
                if matrix[m][n] == target:
                    return True
        return False
    
# Time: O(m * log n)
# Space: O(1)

# Performing binary search on each row
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)
        col = len(matrix[0])
        for m in range(row):
            left = 0
            right = col - 1
            while left <= right:
                mid = (left + right) // 2
                if matrix[m][mid] == target:
                    return True
                elif matrix[m][mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1

        return False
    
# Time: O(m + n)
# Space: O(1)

# Start from the top right corner or bottom left corner because these two points have both low and high on the side where as the 1st element has only larger and last has only smaller elemets on their side
# Check in which direction we need to move i.e if the element is lesser than the target move to the greated side i.e. bottom
# If the element is small move to the lesser side i.e. to the left

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)
        col = len(matrix[0])
        m = 0
        n = col - 1

        while m < row and n >= 0:
            if matrix[m][n] == target:
                return True
            elif matrix[m][n] < target:
                m += 1
            else:
                n -= 1