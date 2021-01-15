# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
	# Consider two pointers at the end of each array
	# compare the values and start putting them at the end of the nums1 array where another pointer is 
	# maintained and decreamented at every point of time.
	# If the pointer for the nums2 hasn't reached the start point and p1 has then just copy the values 
	# from that point to the start of nums2
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n == 0:
            return
        p1 = m - 1
        p2 = n - 1
        i = m + n -1
        
        while(p1 >= 0 and p2 >= 0):
            if nums1[p1] >= nums2[p2]:
                nums1[i] = nums1[p1]
                i -= 1
                p1 -= 1
            else:
                nums1[i] = nums2[p2]
                i -= 1
                p2 -= 1
        while p2 >= 0:
            nums1[i] = nums2[p2]
            i -= 1
            p2 -= 1 