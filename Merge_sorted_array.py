// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
we take three pointers m at m-1 position,n at n-1 position and the n1 at m+n+1 position. if value at index m is less than the value at index n then we send the value from n to n1 position.we then decrement the pointers at n1 and n position.else we copy the value at m position to n1 position.we do this till both the pointers  m and n exhaust.If n is not exhausted then we add the remaining elements to the original array.


class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if n==0:
            return nums1
        i=m-1
        j=n-1
        n1=m+n-1
        while (i>=0 and j>=0):
            if nums1[i]<=nums2[j]:
                nums1[n1]=nums2[j]
                j=j-1
            else:
                nums1[n1]=nums1[i]
                i=i-1
            n1=n1-1
        while j>=0:
            nums1[n1]=nums2[j]
            j=j-1
            n1=n1-1
        return nums1