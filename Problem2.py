"""
// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
-->the idea is to put the elements from both the lists in correct order starting from the end by comparing which of the 2 elements
 from nums1 and nums2 is greater


// Your code here along with comments explaining your approach
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1 # pointer at end of nums1   
        j = n - 1 # pointer at end of nums2
        k = m + n - 1 # pointer at the end of extra space
        
        while i>=0 and j>=0: #while both lists have elements in it 
            
            if nums1[i] > nums2[j]: #compare elements from both the lists
                nums1[k] = nums1[i] #if element in nums1 is greater, put the value at kth position in nums1
                i = i - 1 #and decrement i pointer
            else:
                nums1[k] = nums2[j] #else if element in nums2 is greater, put the value at kth position in nums1 
                j = j - 1 #and decrement j pointer
                
            k = k - 1 #decrement k each time
        
        nums1[:j+1] = nums2[:j+1] #if there are elements remaining in nums2, copy to nums1