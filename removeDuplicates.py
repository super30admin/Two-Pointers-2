# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# The code uses a left and a right pointer
# If the left and right pointer are the same the sumber has been seen before, it swaps the left and right
# It keeps swapping elements until the end and returns the count
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # The below solution runs on LeetCode but it does not use 2-pointers
        # I use a hashmap to store the counts of nums
        # If a number has appeared more than once, I put the largest int possible in its place
        # At the end I sort the array again and that pushes all the maxsize to the end of the array
        # The solution ran in O(n) and did not use additional space
        # seen = {}
        # if len(nums) <= 2:
        #     return len(nums)
        # count = 0
        # for i, num in enumerate(nums):
        #     # We have seen the number before, check to make sure additional duplicates are removed
        #     if num in seen:
        #         # We have seen the number once, we can allow at most 2 of the same number
        #         if seen[num] == 1:
        #             # Slice the array to remove num
        #             # nums[i] = math.inf
        #             seen[num] += 1
        #             count += 1
        #         else:
        #             seen[num] += 1
        #             nums[i] = sys.maxsize
        #             # Slice the array to remove num
        #     else:
        #         # Haven't seen the number before, don't need to change array
        #         seen[num] = 1
        #         count += 1
        # nums.sort()
        # return count

        n = len(nums)
        #Base case
        if n < 3:
            return n
        #Define pointers
        left = 0
        right = 1
        count = 0
        # Remove Duplicates
        while right < n:
            if nums[left] != nums[right]:
                left += 1
                nums[left] = nums[right]
                count = 0
            elif ((nums[left] == nums[right]) and (count < 1)):
                count += 1
                left += 1
                nums[left] = nums[right]
            right += 1
        return left + 1
