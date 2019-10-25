#Leetcode - wrong answer
#Explanation - The idea is to have two pointers at end of each array to compare the values and put
#them in appropriate positions

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1len = len(nums1)
        i = n-1
        while i>0 and nums1len >= 0 and m>=0:
            if nums2[i] > nums1[m]:
                nums1[nums1len-1] = nums2[i]
                nums1len -= 1
                i -= 1
            else:
                nums1[nums1len] = nums1[m]
                nums1[m] = 0
                nums1len -= 1
                m-=1=