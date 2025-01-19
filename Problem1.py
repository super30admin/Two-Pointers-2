# Two pointer approach. We take two pointers on index 1, and keep traversing with i and upating j when count is less than 2 and if it's greater just increment i. Increment count if it's same as previous number
# TC: O(n)
# SC: O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return
        i, j = 1, 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j
            
