# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: Edit and Remove Duplicates in an array

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        n = len(nums)
        fast = 0
        k = 2
        count = 0
        while fast < n:
            if fast > 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow