"""
Intuition: Start from the back of each nums array to avoid major reordering.
#####################################################################
Time Complexity : O(M+N) where M+N = total elements
Space Complexity : O(1) 
#####################################################################
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    
        pointerOne = m-1
        pointerTwo = n-1
        index = m+n-1
        while pointerOne >= 0 and pointerTwo >=0:
            
            num1 = nums1[pointerOne] 
            num2 = nums2[pointerTwo] 

            if num1 < num2:
                nums1[index] = nums2[pointerTwo] 
                pointerTwo -=1
            else:
                nums1[index] = nums1[pointerOne] 
                pointerOne -=1   
            index -= 1
        while pointerTwo >=0:
            nums1[index] = nums2[pointerTwo] 
            pointerTwo -=1
            index -=1