"""
Time Complexity : O(n) + O(m+n)log(m_n)
Space Complexity : O(1) No new data structure is used
Did this code successfully run on Leetcode :
Three line explanation of solution in plain english:
1. Take three pointers, one at the m(end of the number of elements in the nums1), second at the n (number of elements in the n) and third at len(nums)-1. 
2. Compare the elements at ptr1 and ptr2 and whichever is greater move at the ptr3. Increment ptr3 and the ptr which has greatest element. Continue this until either ptr1 and ptr2 < 0.
3. If ptr2 > 0, then transfer all the elements in nums2 in nums1.

// Your code here along with comments explaining your approach
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m - 1
        ptr2 = n - 1
        ptr3 = (m+n) - 1

        while (ptr1 >= 0 and ptr2 >= 0 ):
            if nums1[ptr1] >= nums2[ptr2]:
                nums1[ptr3] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[ptr3] = nums2[ptr2]
                ptr2 -= 1
            ptr3 -= 1
        while(ptr2 >= 0):
            nums1[ptr3] = nums2[ptr2]
            ptr2 -= 1
            ptr3 -= 1

        