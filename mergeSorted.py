# https://leetcode.com/problems/merge-sorted-array/
# Time O(m+n) Total length of nums1
# Space O(1) : No extra space used, modified in-place

class Solution:
    def merge(self, nums1 , m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not m:
            for i in range(n):
                nums1[i] = nums2[i]
        if not n:
            return
        
        p1, p2, last = m-1, n-1, len(nums1) - 1
        
        while p2 >= 0 and p1 >= 0:
            if nums2[p2] >= nums1[p1]:
                nums1[last] = nums2[p2]
                p2 -= 1
                
            else:
                nums1[last] = nums1[p1]
                p1 -= 1
            last -= 1
        
        while p2 >= 0:
            nums1[last] = nums2[p2]
            last -= 1
            p2 -= 1

nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
s = Solution()
output = s.merge(nums1, m, nums2, n)
print(nums1)