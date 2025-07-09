# Time Complexity: O(n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        if not nums1 or not nums2:
            return None

        # Two pointers approach
        # p1 --> pointer for nums1, p2 --> pointer for nums2, p3 --> pointer of the merged array
        # Start from the end of nums1 and nums2
        # and fill nums1 from the end at p3 to the towards the start
        # comparing elements from nums1 and nums2 using p1  and p2
        p1=m-1
        p2=n-1
        p3= (m+n)-1

        while p1>=0 and p2>=0:
            # place greater of two elements of nums1 and nums2, at the end of nums1 at p3 postion
            # and decrement the pointer for that array
            if nums1[p1]>nums2[p2]:
                nums1[p3] = nums1[p1]
                p1-=1
            
            else:
                nums1[p3] = nums2[p2]
                p2-=1
            p3-=1

        # while the pointer for nums2 is still not reached the start
        # we need to copy the remaining elements of nums2 to nums1
        while p2>=0:
            nums1[p3] = nums2[p2]
            p2-=1
            p3-=1
