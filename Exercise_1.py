class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        write, rep = 1, 0

        for idx, num in enumerate(nums[1:]):
            rep = rep + 1 if num == nums[idx] else 0
            if rep <= 1:
                nums[write] = num
                write += 1
        return write