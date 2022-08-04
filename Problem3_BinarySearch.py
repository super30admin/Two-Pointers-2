# Time complexity : O(m*logn) --> m - rows and n - columns
# Space complexity : O(1)
# Leetcode : Solved and submitted
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        
        # we traverse each row and check if the value lies within that end columns, if yes, we go through the binary search for that row
        for i in range(m):
            if matrix[i][0] > target and matrix[i][n-1] < target:
                return False
            
            # setting the low and high as the first and last element in that particular low, find mid and start the binary search
            # we do the same process for each row and return True if the element is found
            low = 0
            high = n - 1
            
            while low <= high:
                mid = low + (high - low) // 2
                if matrix[i][mid] == target:
                    return True
                elif matrix[i][mid] < target:
                    low = mid + 1
                else:
                    high = mid - 1
        
        return False
