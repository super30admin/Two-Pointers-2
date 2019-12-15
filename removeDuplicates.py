# Time Complexity : One: O(n^2) | Two: O(1)
# Space Complexity : One: O(n) | Two: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Thinking about the logic

class Solution(object):
    def removeDuplicatesOne(self, nums):
        i = 1
        count = 1
        while i < len(nums):
            # print(nums[i])
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count > 2:
                nums.pop(i)
                i -= 1
            i += 1
        return nums

    def removeDuplicatesTwo(self, nums):
        j = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1

        return nums[:j]


nums = [1,1,1,1,2,2,3]
obj = Solution()
print(obj.removeDuplicatesOne(nums))
nums = [1,1,1,1,2,2,3]
print(obj.removeDuplicatesTwo(nums))