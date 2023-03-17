# Time Complexity :  O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 1

        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
        return slow
            