# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : No 
# // Your code here along with comments explaining your approach
#merge Sorted Array
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        #Taking the final array length
        last = m + n - 1
        #comparing from last numbers and then moving the larger one to the empty space in the end 
        while m > 0 and n > 0:
            if nums1[m-1] > nums2[n-1]:
                nums1[last] = nums1[m-1]
                m -= 1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1
        #putting remaing numnber if there are any 
        while n>0:
            nums1[last] = nums2[n-1]
            n, last = n-1, last-1
        