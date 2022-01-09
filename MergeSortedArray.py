
#TimeComplexity:O(n)
#SpaceComplexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No
#Used Two Pointers approach to solve the problem
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        ptr2 = n-1
        
        ptr3 = len(nums1)-1
        
        
        while(ptr1 >=0 and ptr2 >=0):
            if(nums1[ptr1] >= nums2[ptr2]):
                nums1[ptr3] = nums1 [ptr1]
                
                ptr1 -=1
                ptr3 -=1
            else:
                nums1[ptr3] = nums2[ptr2]
                ptr2-=1
                ptr3-=1
        while(ptr2 >=0):
            nums1[ptr3] = nums2[ptr2]
            ptr2 -=1
            ptr3 -=1
            
    
                
            