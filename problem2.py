# Problem2 (https://leetcode.com/problems/merge-sorted-array/)

# TC : O(m+n) - process each element exactly once

# SC : O(1) - modify nums1 in-place with no extra space

# Approach:
    # Starting from the end of both arrays (rather than the beginning)
    # Comparing elements and placing the larger one at the end of nums1
    # Moving backward through both arrays until all elements are placed
    # Handling any remaining elements from nums2

# Did this code successfully run on Leetcode : YES

def merge(nums1, m, nums2, n):
    # Start from the end of both arrays
    p1 = m - 1  # Pointer for nums1 (actual elements)
    p2 = n - 1  # Pointer for nums2
    p = m + n - 1  # Pointer for where to place elements in nums1
    
    # While there are elements in both arrays
    while p1 >= 0 and p2 >= 0:
        if nums1[p1] > nums2[p2]:
            nums1[p] = nums1[p1]
            p1 -= 1
        else:
            nums1[p] = nums2[p2]
            p2 -= 1
        p -= 1
    
    # If there are remaining elements in nums2
    # (No need to handle remaining elements in nums1 as they're already in place)
    while p2 >= 0:
        nums1[p] = nums2[p2]
        p2 -= 1
        p -= 1