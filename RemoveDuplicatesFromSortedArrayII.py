# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/
# Approach: 2-pointer approach

# Here we will use two pointers i and j, where j is used for assignment and i used for probing in the array. The algorithm is quite straight forward. We will keep maintaining the count, as it should be at the most twice. If two adjacent values are the same then increase the count and if its still less than or equal to 2 then assign value at index i at index j and increment the j pointer. At the end return the position of j that will determine the length of the array.

# Time complexity: O(n); n = length of the given array
# Space complexity: O(1)


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        
        j = 1
        cnt = 1
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                cnt += 1
            else:
                cnt = 1
            if cnt <= 2:
                nums[j] = nums[i]
                j += 1
                
        return j