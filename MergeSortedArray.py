  ---------------------- Merge Sorted Array------------------------------------------------   
# Time Complexity : O(M+N) M is the length of nums1 array and N is the length of the nums2 array.
# Space Complexity : O(1) as I am returning the same array used for exploring numbers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I used 3 pointer approach where the first pointer is m-1, second is n-1 and third is m+n-1. Then i will compare the m-1 and n-1 element, 
#If the nums1 array is greater than the n-1 element add the last element of array to that as both the arrays are sorted. 
#I will iterate through all the 2nd array elements are arranged in nums1.


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p = m+n-1
        i = m-1
        j = n-1

        while i>=0 and j>=0:
            if nums2[j]>=nums1[i]:
                nums1[p] = nums2[j]
                p -=1
                j -=1
            else:
                nums1[p] = nums1[i]
                p -=1
                i -=1
        while j>=0:
            nums1[p] = nums2[j]
            p -=1
            j -=1