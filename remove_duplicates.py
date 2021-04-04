# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not len(nums):
            return 0
        s = 1
        f = 1
        count = 1
        while f < len(nums):
            if nums[f] == nums[f-1]:
                if count != 2:
                    nums[s] = nums[f]
                    s += 1
                    count += 1
            else:
                count = 1
                nums[s] = nums[f]
                s += 1
            f += 1
        return s
            
        