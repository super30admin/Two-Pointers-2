class Solution:
    
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        """
        Do not return anything, modify nums1 in-place instead.
        
        Problem 1: Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array
        
        Approach: Use 2 pointers
        - start from last index (utilizing the sorted order of both arrays)
        - compare the numbers and move largest at the end in nums1
        - keep a separate index to place the values in original array nums1
        
        Time Complexicity: O(m + n): where m and n are lengths of respective arrays
        Space Complexicity: O(1)
        
        """
        
        if n == 0: return nums1
        i = m - 1; j = n - 1
        idx = m + n - 1
        
        while i >= 0 and j >= 0:
            if nums1[i] <= nums2[j]:
                nums1[idx] = nums2[j]
                j -= 1
            else:
                nums1[idx] = nums1[i];
                i -= 1
            idx -= 1
        while j >= 0:
            nums1[idx] = nums2[j]
            j -= 1; idx -= 1
        
        return nums1


class Solution:
    
    def removeDuplicates(self, nums: List[int]) -> int:
        
        """
        Problem 2: Given a sorted array nums, remove the duplicates in-place:
        - Duplicates appeared at most twice and return the new length.
        - Modify the input array (no additional space need to be created)
        
        Approach: 2-pointers
        - Use fast and slow pointers starting at index = 1:
        - Check value at fast and fast-1 and count them 
        - replace values in slow when count is less than 2
        
        Time Complexicity: O(n), where n = length of the array
        Space Complexicity: O(1), no additional space created
        
        """
        if len(nums) == 0: return []
        
        left = 1; count = 1; length = 1
        for right in range(1, len(nums)):
            if nums[right] == nums[right - 1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[left] = nums[right]
                length += 1
                left += 1
                
        return length


class Solution:
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    
        """
        Problem 3: Search for a target in a matrix sorted by rows and columns
        - return "True" if target found, otherwise return "False"
        
        Approach: Utilize the property of matrix already being sorted
        - start from either bottom-left or top-right corner 
        - until target is found or the indices are about to be out of bounds
        
        Time Complexicity: O(m*log n), where m and n are rows and columns of given matrix respectively
        Space Complexicity: O(1)
        
        """
        
        m = len(matrix) # number of rows
        n = len(matrix[0]) # number of columns
        
        if len(matrix) == 0: return False
        row_idx, col_idx = 0, n - 1 # starting indices to search
        while row_idx < m and col_idx >= 0:
            if matrix[row_idx][col_idx] > target:
                col_idx -= 1
            elif matrix[row_idx][col_idx]  < target:
                row_idx += 1
            else: 
                return True
                
        return False
