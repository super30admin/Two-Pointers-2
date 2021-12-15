# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :YES


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<3: 
            return len(nums)
        low=0
        high=1
        # using high and low as two pointers

        while(high<len(nums)):
            if nums[low]==nums[high]:
                # if low is equal to high check if there are more than 2 count of same number
                if high-low>=2:
                    del nums[high] #del the current if yes and do not move high
                else:
                    high+=1
            else:
                # until low== high move high and low forward but high one step ahead found move 
                low=high
                high+=1
        return len(nums)