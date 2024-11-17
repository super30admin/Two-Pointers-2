#TC: O(n)
#SC: O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow, fast = 0, 0
        count = 0
        while fast < len(nums):
            if fast > 0 and nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1

        return slow
