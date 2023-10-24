#Time Complexity : O(m+n) since we iterate through both the lists
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We use 3 pointers (1 at m, 2 at n and 3 at m+n). We compare the values of pointer at 1 and 2 and move the value of pointer
# whichever is greater. We move the pointer 3 by 1 on left and also move the pointer whos value which was greater by 1 on left.
# In the end if there are values left in nums2, we move those directly to the pointer 3 and move both to left by 1 until pointer 2
# is out of bounds

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        idx = m+n-1
        while p1>=0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -=1
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            idx -= 1
            p2 -= 1        