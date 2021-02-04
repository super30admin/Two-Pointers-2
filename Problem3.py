// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not nums1 or not nums2:
            return
        i=n-1 if n>0 else 0
        j=m-1 if m>0 else 0
        index=n+m-1
        while i>=0 and j>=0:                              //start traversing both the lists from last elements and initially index will point to len(nums1)-1             
            if nums1[j]>nums2[i]:                         //if nums1[j] >nums1[i] store element nums1[j] at (index)th index of nums1  and decrement index and j   
                nums1[index]=nums1[j]
                j-=1
            else:                                       //if nums1[j] < nums1[i] store element nums2[i] at (index)th index of nums1  and decrement index and j      
                nums1[index]=nums2[i]
                i-=1
            index-=1

        while i>=0:                                      // if i>0 => replace all the remaining indexes from list nums2 to nums1 at same indexes
            nums1[i]=nums2[i]
            i-=1
        
