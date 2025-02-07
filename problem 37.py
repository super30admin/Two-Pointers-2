#  https://leetcode.com/problems/merge-sorted-array/

# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        idx = m+n-1

        while p1 >= 0 and p2 >= 0: 
            if nums1[p1] > nums2[p2]: # comparing the last numbers 
                nums1[idx] = nums1[p1] # replacing the last 0's with the max no from above step
                p1-=1
            else:
                nums1[idx] = nums2[p2]
                p2-=1
            idx-=1 # move backwards
        while p2>=0:
            nums1[idx] = nums2[p2] # if still p2 is left with more entries then just place them accordingly
            idx -=1
            p2-=1
        