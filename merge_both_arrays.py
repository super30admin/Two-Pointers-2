
"""
TC : O(m+n) where m is the no. of elements in nums1 and n in nums2
SC : O(1) no extra space/Auxillary data structure used
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        #Edge case check
        if not nums1 or len(nums1) == 0: return -1
        
        p1 = m-1 #pointer 1 starting from ed of nums1 array
        p2 = n-1 #pointer 2 starting from end of nums2 array
        idx = m + n -1
        
        while p1 >=0 and p2 >=0: #simultaneously traverse both arrays
            if nums1[p1] > nums2[p2]: #compare elements in nums1 and nums2
                nums1[idx] = nums1[p1] #If element in nums1 is greater, place it in the last
                p1 -= 1 #decrement p1
            else:
                nums1[idx] = nums2[p2] #if element in nums2 is greater, place it in nums1 at last
                p2 -= 1 #decrement p2
                
            idx -= 1 #decrement index of nums1 
        
        while p2 >= 0: #check for the completion of nums2 array
            nums1[idx] = nums2[p2] # place all the leftover elements in nums2 in nums1
            p2 -= 1         #decrement p2
            idx -= 1        #decrement index in nums1