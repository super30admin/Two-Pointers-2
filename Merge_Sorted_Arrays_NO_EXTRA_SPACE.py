# Created by Aashish Adhikari at 6:15 PM 1/11/2021
'''
Time Complexity:
O(max(m,n))

Space Complexity:
O(1)
'''

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """


        p1 = m-1
        p2 = n-1
        replace_pointer = m+n-1

        while p1 >= 0 and p2 >= 0:

            if nums1[p1] < nums2[p2]:

                nums1[replace_pointer] = nums2[p2]
                p2 -= 1
            else:
                nums1[replace_pointer] = nums1[p1]

                p1 -= 1
            replace_pointer -= 1

        # If p2 ends, p1 does not need any more sorting.
        # But if p1 ends before p2, replace the elements in nums1
        if p1 == -1:

            nums1[0:p2+1] = nums2[0:p2+1]






        