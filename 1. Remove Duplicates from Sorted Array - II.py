class Solution:
    def removeDuplicates(self, nums) -> int:
        # Time Complexity = O(n)
        # Space Complexity = O(1)
        k = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i - 1] == nums[i]:
                count += 1
                if count > 2:
                    continue
            else:
                count = 1

            nums[k] = nums[i]
            k += 1
        return k