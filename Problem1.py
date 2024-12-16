class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        fast = 0
        slow = 0
        count = 0
        n = len(nums)

        while fast < n:
            if fast > 0 and (nums[fast] == nums[fast - 1]):
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1

        return slow
