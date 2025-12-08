# Assign pointer P1 to m-1, p2 to n-1 and p3 to m+n-1. While P1 and P2>=0 check max 
# between the element at nums1[p1] and nums2[p2] and update nums1[p3] with the max value.
#  decrement P3 and P1 or P2 depending on which was max. After the loop terminates, 
#  check if P2>=0. If it is, copy all the elelemts at nums2 from 0 to p2 to nums1 at 0 to p2.

#  Time complexity: O(m+n)
#  Space complexity: O(1)



class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """

        p1=m-1
        p2=n-1
        p3=m+n-1

        while p2>=0 and p1>=0:
            if nums1[p1]>=nums2[p2]:
                nums1[p3]=nums1[p1]
                p1-=1
            else:
                nums1[p3]=nums2[p2]
                p2-=1
            p3-=1
        # print(nums1, p2, nums2)
        if p2>=0:
            for i in range(p2+1):
                nums1[i]=nums2[i]

