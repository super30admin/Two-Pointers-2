#Time Complexity :O(N) where N is number of inouts
#Space Complexity : O(1)
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        ptr2 = n-1
        k = m+n -1
        if n == 0:
            return
        while(ptr1 >=0 and ptr2 >=0):
            if nums1[ptr1] <= nums2[ptr2] :
                nums1[k] = nums2[ptr2]
                ptr2 -=1
                k-=1
            elif nums1[ptr1] > nums2[ptr2]:
                nums1[k]=nums1[ptr1]
                ptr1-=1
                k-=1
        while (ptr2 >= 0):
            nums1[k] = nums2[ptr2]
            ptr2-=1
            k-=1
                