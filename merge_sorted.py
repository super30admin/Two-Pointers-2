#Time Complexity : O(m+n) m : length of the array1 and n :length of the array2
# Space Complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Start from the end of the two lists.
#            also, record the pointer of the sorted array
#            copy the greater number to the pointer of teh sorted index and decrement the respective pointer(array with greater number) 
#            also,copy the rest of the elements from array 2 with not reached end.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        idx = m+n-1
        l1= m-1
        l2= n-1
        
        while(l1>=0 and l2>=0):
            if nums1[l1] > nums2[l2]:
                nums1[idx]=nums1[l1]
                l1-=1
            else:
                nums1[idx]=nums2[l2]
                l2-=1
            idx-=1
            
        while(l2>=0):
            nums1[l2] = nums2[l2]
            l2-=1
                
                
            
                
        
       
    