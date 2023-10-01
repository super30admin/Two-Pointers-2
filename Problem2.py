'''
1. We start from the end of both the arrays and compare the elements at the end of both the arrays.
2. If the element at the end of nums1 is greater than the element at the end of nums2, we replace the element at the end of nums1 with the element at the end of nums1 and decrement the pointers.
3. If it is lesser then we replace the element at the end of nums1 with the element at the end of nums2 and decrement the pointers.
4. We repeat this process until we reach the end of either of the arrays. If we reach the end of nums1, we copy the remaining elements of nums2 to nums1.

TC: O(m+n)
SC: O(1)
'''
class Solution:
    def merge(self, nums1, m, nums2, n):
        if nums1 == None or len(nums1) == 0:
            return
        p1,p2,p3 = m-1, n-1, m+n-1

        while (p1>=0 and p2>= 0):
            if nums1[p1]> nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
            p3 -= 1

        while p2>=0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1 
