# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        slow = 1
        fast = 1
        count = 1
        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow


## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        if not nums1 or not nums2:
            return
        i = m-1
        j = n-1
        k = m+n-1
        while i >=0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            else:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
        while j >= 0:
            nums1[k] = nums2[j]
            k -= 1
            j -= 1


## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def searchMatrix(self, matrix, target):
        if not matrix:
            return False
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1
        return False

