# Leetcode 88. Merge Sorted Array

# Time Complexity :  O(m+n) where m,n are the no. of elements in each array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Create 2 pointer one for reverse index of nums1 initialized , one for reverse index of nums2
#  Create one more for target index i.e. last index in nums1 as we traverse array in reverse
#  Start with reverse index of nums1 and nums2
#  Compare their elements which ever is greater move it to target index in nums1 and reduce its pointer
#  Keep swapping until nums1 & nums2 both have elements to be visited
#  if nums2 is still remaining after all nums1 elements are visited add the remaining nums2 elements

# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m-1
        second = n-1
        index = m+n-1
        for i in range(index, -1, -1):
            if first >= 0 and second >= 0:
                if nums2[second] > nums1[first]:
                    nums1[i] = nums2[second]
                    second -= 1
                else:
                    nums1[i] = nums1[first]
                    first -= 1
            elif second >= 0:
                nums1[i] = nums2[second]
                second -= 1
