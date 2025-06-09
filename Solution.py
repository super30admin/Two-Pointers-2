'''
// Time Complexity :
# Problem 1 - O(n) as we parse through all the elements
# Problem 2 - O(m+n) as we parse through both the arrays and replace
# Problem 3 - O(m x n) Brute force, O(m log n) Binary search, O(m + n) Two Pointers
// Space Complexity :
# Problem 1 - O(1) as we perform inplace swap of elements
# Problem 2 - O(m+n) since we replace and update elements in the same array
# Problem 3 - O(1) amortized as we use the given matrix
// Did this code successfully run on Leetcode :
# Yes the code ran successfully.

// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
'''
## Problem 1 - Remove duplicates from sorted array

# Initialize a slow pointer starting with the first index and a count varaible to track repeats
# Run a for loop and check if the first element value is equal to second element value, if so we 
# increase the count else we reset the count to '1'
# In case the count is less than 2 (meaning element is repeating twice) we swap the element with the 
# position of the slow pointer and increment it.
# Return the original array.

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow = 1; count = 1
        n = len(nums)
        for i in range(1,n):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        return slow


## Problem 2 - Merge Sorted arrays
# Initialize two pointers starting with the last element of the arrays from the given sizes and an 
# index pointer starting with the total size of both the arrays.
# While both pointers are greater than '0', check if the value of first pointer element is greater than
# the second pointer element and swap with the index pointer position. Decrement the first pointer.
# Else we will swap the second pointer element with the index pointer position.
# In case of varying sizes if the first array finishes then we copy the elements of the second array 
# and replace the values directly using the index pointer.

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        idx = m + n - 1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1

## Problem 3 - Search a 2D matrix array

# Brute Force
# Initialize the length and width of the matrix
# Iterate over each cell to find the element
# When the element is found return "TRUE" else return "FALSE"

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None or len(matrix) == 0:
            return False
        
        m = len(matrix)
        n = len(matrix[0])

        for i in range(m):
            for j in range(n):
                if matrix[i][j] == target:
                    return True
        return False

# Binary Search
# For each row in the matrix perform binary search
# Binary search is based on length of each row, if the value of row is less than target then we increment
# the low to mid + 1 element else we decrement the high to mid - 1 element
# If the mid element is equal to target then we return true else if the low crosses the high we return
# False
# If binary search is successful we return TRUE or if we do not find the element in any row return FALSE

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None or len(matrix) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])

        for i in range(m):
            # Optimization
            first = matrix[i][0]; last = matrix[i][n-1]
            if first <= target and last >= target:
                if self.binarysearch(matrix, i, n, target):
                    return True
        return False

    def binarysearch(self, matrix, row, n, target):
        low = 0; high = n - 1

        while low <= high:
            mid = low + (high - low) // 2
            curr = matrix[row][mid]
            if curr == target:
                return True
            elif curr < target:
                    low = mid + 1
            else:
                high = mid - 1
        return False
    
# Two Pointers
# We search for the element either from the Top right element OR the Bottom left element of the matrix
# Iterate starting from top right element until the column is not out of bounds and row is greater than
# zero
# If the current element is the target we return TRUE else if it is less than the target move to the 
# next row eliminating the row elements else decrement the column
# The element is not found return FALSE

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None or len(matrix) == 0:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        # i = 0; j = n-1 ----> TOP LEFT ELEMENT
        # while i < m and j >= 0:
        #     if matrix[i][j] == target: return True
        #     elif matrix[i][j] < target:
        #         i += 1
        #     else:
        #         j -= 1
        # return False
        i = m - 1; j = 0 #----> BOTTOM LEFT ELEMENT
        while j < n and i >= 0:
            if matrix[i][j] == target: 
                return True
            elif matrix[i][j] < target:
                j += 1
            else:
                i -= 1
        return False