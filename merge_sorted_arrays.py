'''
We maintain 3 pointers, 
    num1_pointer -> m-1 idx
    nums2_pointer -> n-1 idx
    filling_pointer -> m+n-1 idx
We will start filling from behind with the number largest among num1_pointer and 
num2_pointer. 
if num1_pointer <0 then we can exit the loop and copy remaining num2 elements to nums1.
if nums2_pointer <0, then we are done. 
Time Complexity: O(m+n)
Space Complexity: O(1)
'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        num1_pointer = m-1
        num2_pointer = n-1
        filling_pointer = m+n-1

        while num1_pointer>=0 and num2_pointer>=0:
            
            if nums1[num1_pointer]>nums2[num2_pointer]:
                nums1[filling_pointer]=nums1[num1_pointer]
                num1_pointer-=1
            else:
                nums1[filling_pointer]=nums2[num2_pointer]
                num2_pointer-=1
            
            filling_pointer-=1
        
        while num2_pointer>=0:
            nums1[filling_pointer] = nums2[num2_pointer]
            num2_pointer-=1
            filling_pointer-=1
        



        