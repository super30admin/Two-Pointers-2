"""
Time Complexity : 0(m+n)
Space Complexity: 0(1)
Approach:
    1. Use three ptrs
    2. All will start at the last position of m,n and m+n
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        

        # use 3 ptrs
        ptr1 = m-1
        ptr2 = n-1
        ptr3 = (m+n)-1

        while True:

            # check for ptr2 and ptr1 if lost bounds
            if ptr1 < 0:
                break
            
            if ptr2 < 0:
                break

            # compare ptr1 and ptr2 values
            if nums1[ptr1] < nums2[ptr2]:
                
                # put nums[ptr2] at nums[ptr3] position
                nums1[ptr3] = nums2[ptr2]
                ptr3 -= 1
                ptr2 -= 1
            
            else:

                # put nums[ptr2] at nums[ptr3] position
                nums1[ptr3] = nums1[ptr1]
                ptr3 -= 1
                ptr1 -= 1
        
        # end of while loop
        
        # check if ptr1 is out of bounds -- ptr1 elements are already in correct place
        while ptr2 > -1:
            nums1[ptr3] = nums2[ptr2]
            ptr3 -= 1
            ptr2 -= 1
