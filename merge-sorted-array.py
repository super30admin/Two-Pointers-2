class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        #         j=0
        #         for i in range(n):

        #             nums1[m+i]=nums2[i]
        #             # j+=1
        #         return nums1.sort()
        #     #time=O(m+nlogn) space-O(1)
        if nums1 == [] or len(nums1) == 0:
            return
        pt1 = n - 1
        pt2 = m - 1
        p = m + n - 1
        while pt1 >= 0 and pt2 >= 0:
            if nums2[pt1] < nums1[pt2]:
                nums1[p] = nums1[pt2]
                pt2 -= 1
            else:
                nums1[p] = nums2[pt1]
                pt1 -= 1
            p -= 1
        while pt1 >= 0:
            nums1[p] = nums2[pt1]
            p -= 1
            pt1 -= 1
        return nums1
    # O(m+n)-time
    # space-O(1)