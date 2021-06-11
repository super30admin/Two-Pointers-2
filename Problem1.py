# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#using slow and fasyt pointer and reaplcing the values of the fast and slow pointer
#if count crosses 2 or any k for that matter

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        n = len(nums)
        s,f=1,1
        count = 1
        for f in range(1,len(nums)):
            if nums[f] == nums[f-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[s] = nums[f]
                s += 1
        return s