#Time Complexity : O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
       
        l,r= 2, 2

        while r < len(nums):
            if nums[l - 2] != nums[r]:
                nums[l] = nums[r]
                l += 1
            r += 1
        return l
    
    
