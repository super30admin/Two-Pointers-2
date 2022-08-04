# Time Complexity : O(m+n)
# Space Complexity : O(1) or constant auxiliary space complexity
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 =  m-1 # One pointer at the end of nums1's first m elements
        p2 = n-1 # One ptr at the end of nums2
        idx = (m+n)-1 # Or len(nums) - 1 # At the end of nums1 i.e at m+n -1
        
        while(p1 >= 0 and p2 >= 0):
            if nums1[p1] >= nums2[p2]: # IF element at p1 is more than p2, then put p1 at the end of nums and reduce idx and p1
                nums1[idx] = nums1[p1]
                idx -= 1
                p1 -= 1
            else:
                nums1[idx] = nums2[p2] # If element at p2 is more than p1, put that at idx and reduce idx and p2
                idx -= 1
                p2 -= 1
        while(p2>=0):
            # If we didn't put all elements of p2 yet into p1, then we put them in now
            nums1[idx] = nums2[p2]
            idx -= 1
            p2 -= 1