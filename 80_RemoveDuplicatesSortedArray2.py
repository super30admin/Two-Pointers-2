"""
TC: O(n)
SC: O(1)
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0
        r = 0
        while (r < len(nums)):
            count = 1
            while (r + 1 < len(nums) and nums[r] == nums[r + 1]): #find the occurences of repeating elements
                r += 1
                count += 1

            for i in range(min(2, count)): #taking the min to handle situations where the repeating elemnt count <=2
                nums[l] = nums[r]
                l += 1
            r += 1
        return l