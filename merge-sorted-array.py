# #brute force
# #Copy all elements from nums2 into the empty part of nums1. Sort the entire nums1 array after insertion.
# #Time complexity: O((m+n)log(m+n)), due to the sort() function
# #Space complexity: O(1)
# class Solution:
#     def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
#         """
#         Do not return anything, modify nums1 in-place instead.
#         """
#         j = 0
#         for i in range(m, m + n):
#             nums1[i] = nums2[j]
#             j += 1
#         nums1.sort()

#Two-pointers
#Pointers p1 and p2 start at the end of the valid parts of nums1 and nums2, respectively.
#idx starts at the last index of nums1 (which has enough space to hold all elements).
#Compare from the back and place the larger of nums1[p1] and nums2[p2] at nums1[idx], moving backward.
#Time complexity: O(m+n), We are iterating through both arrays once, so the time complexity is O(m+n).
#Space complexity: O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m - 1
        p2 = n - 1
        idx = m + n - 1        
        while p2 >= 0:
            if p1 >= 0 and nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1    