#88. Merge Sorted Array
#Time Complexity : O(n). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#intialised i to m -1 of nums1 array , k to sum on m & n in nums 1 and j to n -1 in nums2. Then will compare i and j if i is less then move the j value to k and decrement k and j #else move i to k and decrement i and k untill i or j reaches 0

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if m == 0 and n == 0:
            return
        k = m+n -1
        i = m-1
        j= n-1
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                k = k -1
                i = i - 1
            else:
                nums1[k] = nums2[j]
                k = k - 1
                j = j - 1
        while j >= 0:
            nums1[k] = nums2[j]
            j = j - 1
            k = k - 1
