""""// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""

class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        index=len(nums1)-1
        while p2>=0 and p1>=0:
            if nums1[p1]<nums2[p2]:
                nums1[index]=nums2[p2]
                index-=1
                p2-=1
            else:
                nums1[index]=nums1[p1]
                index-=1
                p1-=1
        while p2>=0:
            nums1[index] = nums2[p2]
            index -= 1
            p2 -= 1

        return nums1
Obj = Solution()
print(Obj.merge([2,0],1, [1],1))


# class Solution:
#     def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
#         """
#         Do not return anything, modify nums1 in-place instead.
#         """
#         p1 = m - 1
#         p2 = n - 1
#         for i in range(m + n - 1, -1, -1):
#             if p2 < 0:
#                 break
#
#
#             elif p1 >= 0 and nums1[p1] > nums2[p2]:
#                 nums1[i] = nums1[p1]
#                 p1 -= 1
#             else:
#                 nums1[i] = nums2[p2]
#                 p2 -= 1
#
#         return nums1