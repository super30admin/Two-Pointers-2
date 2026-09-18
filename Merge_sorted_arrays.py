# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
#I have used three pointers p1, p2 and p3. P1 is at end of m, p2 end of n and p3 is at end of m+n
#When we compare p1 and p2 and if we find an element greater then replace the p3 pointer with that element and decrement the respective pointer and p3 pointer
# If after the p1 reaches end of array and there are still elements left in nums2 array then replace p3 with p2 elements and decrement both the pointers 

class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        p3 = m+n-1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
        
            p3 -= 1
        
        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p3 -= 1
            p2 -= 1
