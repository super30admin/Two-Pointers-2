# Time Complexity: O(N)
# Space Complexity: O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 0
        prev = None
        count = 1

        for i in range(0, len(nums)):
          if prev == nums[i]:
            if count > 0:
              count -= 1
              nums[i], nums[j] = nums[j], nums[i]
              j += 1
          else:
            prev = nums[i]
            count = 1
            nums[i], nums[j] = nums[j], nums[i]
            j += 1

        return j

          
