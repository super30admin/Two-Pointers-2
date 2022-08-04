# Time complexity : O(m+n)
# Space complexity : O(10
# Leetcode : Solved and submitted

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # maintain pointer for both arrays at the end of the array 
        p1 = m-1
        p2 = n-1
        
        # starting with the max lenght which is m+n, also the resulting final array
        for i in range(n+m-1,-1,-1):
            # if at any point we reach the end of pointer 2, which is array nums2, then we break
            if p2 < 0:
                break
             # which is the higher value provided the array pointer p1 is greater than 0 which is that we have not reached the end of the array
            # then place the value at the last place, where i = m + n
            if nums1[p1] > nums2[p2] and p1 >=0:
                nums1[i] = nums1[p1]
                p1-=1
            else:
              # else fill that place with the nums2 element and move forward
                nums1[i] = nums2[p2]
                p2-=1
                
