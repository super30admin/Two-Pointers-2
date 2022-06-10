# time complexity is o(n), where n is size of the input
# space complexity is o(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 0
        count = 1
        for i in range(1,len(nums)):
            if(nums[left] == nums[i]):
                if(count < 2):
                    left += 1
                    count += 1
                    nums[left] = nums[i]
                else:
                    continue
            else:
                count = 1
                left += 1
                nums[left] = nums[i]
                # left += 1
        return left+1
            