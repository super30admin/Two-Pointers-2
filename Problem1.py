# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def removeDuplicates(self, nums) -> int:
        slow = 1
        count = 1
        k = 2
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count+=1
            else:
                count = 1
            if count<=k:
                nums[slow] = nums[i]
                slow+=1
        return slow
