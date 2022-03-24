
# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p1 = len(nums1) - len(nums2)-1
        p2 = len(nums2) -1
        idx = len(nums1)-1
       
        while(p1>=0 and p2>=0):
            if(nums1[p1]>nums2[p2]):
                nums1[idx] = nums1[p1]
                idx = idx -1
                p1 = p1-1
            else:
                nums1[idx] = nums2[p2]
                idx = idx -1
                p2 = p2-1
        while(p2 >= 0):
            nums1[idx] = nums2[p2]
            idx = idx -1
            p2 = p2-1
                