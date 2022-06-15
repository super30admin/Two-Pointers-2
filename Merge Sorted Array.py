class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        r = len(nums1) -1
        rm = m-1
        rn = n-1
        
        while rn>-1 and rm > -1:
            if nums2[rn] > nums1[rm]:
                nums1[r] = nums2[rn]
                r -= 1
                rn -= 1
            else:
                nums1[r] = nums1[rm]
                r -= 1
                rm -= 1
        while rn > -1 and r > -1:
            nums1[r] = nums2[rn]
            rn -=1
            r -=1
