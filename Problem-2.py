# 88. Merge Sorted Array
# https://leetcode.com/problems/merge-sorted-array/

# Time complexiety: O(max(n,m))
# Space complexiety: O(1)

class Solution:
    def merge(self, nums1, m, nums2, n) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        k = m+n-1

        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
        print(nums1)

obj = Solution()
obj.merge([4,5,6,0,0,0],3,[1,2,3],3)
obj.merge([0],0,[1],1)