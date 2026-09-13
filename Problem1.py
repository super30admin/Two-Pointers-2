#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode :Yes
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        s = k
        f = k
        while (f < len(nums)):
            if nums[s - k] != nums[f]:
                nums[s] = nums[f]
                s += 1
            f += 1
        return s
