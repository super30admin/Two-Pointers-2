#  Problem: https://leetcode.com/problems/merge-sorted-array/description/
#  Time complexity: O(n)
#  Space complexity: O(1)

#  Approach:
#  I am using three pointers p1, p2, and p3.
#  I am iterating over the arrays from the end.
#  I am comparing the elements at p1 and p2.
#  If the element at p1 is greater than the element at p2, I am updating the element at p3 with the element at p1.
#  If the element at p2 is greater than or equal to the element at p1, I am updating the element at p3 with the element at p2.
#  I am decrementing the pointers accordingly.
#  Finally, I am updating the elements at p3 with the remaining elements at p2.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # for i in range(0,n):
        #     nums1[m+i] = nums2[i]
        # nums1.sort()
        p1 = m-1 
        p2 = n-1
        p3 = m+n-1 
        while p2 >= 0 and p1 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 = p1 -1 
            elif nums2[p2] >= nums1[p1]:
                nums1[p3] = nums2[p2]
                p2 = p2 - 1
            p3 = p3 -1 
        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1
    