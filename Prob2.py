# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Since there are n number of 0s at the end of nums1, we can take advantage of this.
# Instead of making a copy of nums1 and writing into it, we can overwrite from the back in nums1 itself.
# Use 2 pointers p1 and p2 at mth and nth index of nums1 and nums2 respectively and -1th index of nums1 by idx.
# Compare nums1[p1] and nums2[p2], whichever is bigger write it at nums[idx] and update pointers.
# If, p1 <=0 that means all original elements of nums1 are done, then just copy all remaining elements of nums2

# // Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        idx=m+n-1 #pointer at end of nums1
        while p1>=0 and p2>=0:
            if nums1[p1]>nums2[p2]: #if nums[p1] is bigger overwrite with that at idx index and decrease p1
                nums1[idx]=nums1[p1]
                p1-=1
            else:
                nums1[idx]=nums2[p2] #if nums[p2] is bigger overwrite with that at idx index and decrease p2
                p2-=1
            idx-=1 #idx is decreased for both of the above cases
        while p2>=0: #if p1 is negative (nums1 is empty) then just overwrite nums2 onto nums1
            nums1[idx]=nums2[p2]
            p2-=1
            idx-=1
        return nums1