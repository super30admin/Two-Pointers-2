# Time Complexity : One: O(m+n) | Two: O(m+n)
# Space Complexity : One: O(m) | Two: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Thinking about the logic

class Solution(object):
    def mergeOne(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
       
        p1 = 0
        p2 = 0
        nums1_copy = [nums1[x] for x in range(m)]
        nums1[:] = []
        while p1 < m and p2 < n:
            if nums1_copy[p1] < nums2[p2]:
                nums1.append(nums1_copy[p1])
                p1 += 1
            else:
                nums1.append(nums2[p2])
                p2 += 1
        if p1 < m: 
            nums1[p1 + p2:] = nums1_copy[p1:]
        if p2 < n:
            nums1[p1 + p2:] = nums2[p2:]
        
    def mergeTwo(self, nums1, m, nums2, n):
        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1
        while p1 >=0 and p2 >=0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
            p3 -= 1
        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1
            

nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,7]
n = 3
obj = Solution()
obj.mergeOne(nums1,m,nums2,n)
print(nums1)
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,7]
n = 3
obj.mergeTwo(nums1,m,nums2,n)
print(nums1)
                