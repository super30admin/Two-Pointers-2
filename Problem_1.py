from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        j = 1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j

obj = Solution()
print(obj.removeDuplicates([1,1,1,2,2,3]))
print(obj.removeDuplicates([0,0,1,1,1,1,2,3,3]))

# Time Complexity: O(n)
# Space Complexity: O(1)