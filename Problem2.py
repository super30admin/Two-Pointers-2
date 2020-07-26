# Time complexity: O(m+n)
# Space complexity: O(1)
# Works on leetcode: yes 
# Approach: Since both array are sorted and we have enough space in nums1 to add nums2 content, we use m and n as 2 pointers
# We start comparing the last elements of both arrays and add the greater one to last position(m+n)th in nums1 and decrese 
# one of the pointers accordingly. 
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        while m>0 and n>0:
            if nums1[m-1] >= nums2[n-1]:
                nums1[m+n-1]=nums1[m-1]
                m -=1
            else:
                nums1[m+n-1]=nums2[n-1]
                n -=1
        if n>0:
            nums1[:n] = nums2[:n]