"""

Time Complexity : O(N)
Space Complexity :O(1)
Did this code successfully run on Leetcode : Yes

Problem2 (https://leetcode.com/problems/merge-sorted-array/)

"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        using two pointer to keep track of elements and right index.
        """
        
        if m == 0 and n == 0: return []
        
        if m !=0 and n == 0:
            return
        
        # pointers for holding the index and other two for comparing the elements    
        last_ptr = (m + n) - 1
        nums1_ptr = m - 1
        nums2_ptr = n - 1
        
        while nums2_ptr >= 0 and nums1_ptr >=0:
            if nums1[nums1_ptr] > nums2[nums2_ptr]:
                nums1[last_ptr] = nums1[nums1_ptr]
                nums1_ptr -= 1
            else:
                nums1[last_ptr] = nums2[nums2_ptr]
                nums2_ptr -= 1
            last_ptr -= 1
            
        while nums2_ptr >=0:
            nums1[last_ptr] = nums2[nums2_ptr]
            nums2_ptr -= 1
            last_ptr -= 1
            
                
                
        