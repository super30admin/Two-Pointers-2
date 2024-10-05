# Approach
# Take 2 pointers at the end of the list since the two arrays are sorted.
# since we cannot get max greater then the last elements compare both pointers and swap the max with last indexes of the array 1


# Complexities
# Time Complexity: O(n)
# Space Complexity: O(1)

from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        pointer1 = m-1
        pointer2 = n-1
        idx = len(nums1)-1

        while pointer1>=0 and pointer2>=0:
            if nums1[pointer1]>nums2[pointer2]:
                nums1[idx] = nums1[pointer1]
                pointer1 -=1
            else:
                nums1[idx] = nums2[pointer2]
                pointer2 -=1
            idx-=1
        while pointer1>=0:
            nums1[idx] = nums1[pointer1]
            pointer1-=1
            idx-=1
        while pointer2>=0:
            nums1[idx] = nums2[pointer2]
            pointer2-=1
            idx-=1



