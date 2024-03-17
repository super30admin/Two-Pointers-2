# TC =O(n)
# SC = O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 0
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        return slow
