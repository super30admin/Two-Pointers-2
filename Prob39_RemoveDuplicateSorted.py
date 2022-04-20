#Time Complexity : 0(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for n in nums:
            if i < 2 or n != nums[i - 2]:
                nums[i] = n
                i += 1
        return i