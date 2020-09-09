# S30 Big N Problem #36 {Easy }

# Merge Sorted Array

# Time Complexity : O(m) m= no. of elements in array 1
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# Maintain 3 pointers. 
# index - to decide where to put the selected no. in array 1. placed at end of array1
# p1 - to move the position of array1. placed at m-1 
# p2 - to move the position of array2.placed at n-1
# based on which element is bigger, at the element at index position
# and decrement that respective pointer. 

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        index=len(nums1)-1
        
        p1=m-1
        p2=n-1
        
        while p1>=0 and p2>=0:
            
            if nums2[p2]>=nums1[p1]:
                nums1[index]=nums2[p2]
                index-=1
                p2-=1
            else:
                nums1[index]=nums1[p1]
                index-=1
                p1-=1
        
        while p2>=0:
            nums1[index]=nums2[p2]
            index-=1
            p2-=1
            
        return nums1
            
                
                
                
        