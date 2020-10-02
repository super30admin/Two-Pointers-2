# Time Complexity: O(N)
# Space Complexity: O(1)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        left = 0
        right = 1
        while right < len(nums):
            if nums[left] == nums[right]:
                count += 1                  # Basic idea is to keep a count and keep on updating the array till count is less than 3. When count goes more than 3 that means we need to skip till the next different number is encountered
            else:
                count = 1
            if count <= 2:
                left+=1
                nums[left] = nums[right]
            right += 1
        return left+1
