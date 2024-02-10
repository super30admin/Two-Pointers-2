#
# @lc app=leetcode id=88 lang=python3
#
# [88] Merge Sorted Array
#

# @lc code=start
'''
Time Complexity - O(m+n) we are iterating both the arrays exactly once.
Space Complexity - O(1), we are only using additional variables

This code works on Leetcode
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        k = m+n-1 #pointer to end of nums1
        m -=1 #pointer to current last element at nums 1
        n-=1 #pointer to last element of nums2
        while m>=0 and n>=0: #start comparison from the last elements in both the arays
            if nums1[m]>=nums2[n]: 
                nums1[k] = nums1[m]#insert element of array1 at its end if it is > than array2 element
                m-=1 #move m left
                k-=1 #move k left
            else:
                nums1[k] = nums2[n] #else insert element of array2 at k if it is > than array1 element
                n-=1 #move n left
                k-=1 #move k left

        while n>=0:#move the remaining elements in array2 to array1
            nums1[k] = nums2[n]
            n-=1
            k-=1
        

# @lc code=end

