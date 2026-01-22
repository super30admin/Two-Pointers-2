# Time Complexity : O(n) where n is the length of the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use two pointers where slow pointer tracks position to place next valid element.
# Fast pointer traverses array, and we allow at most 2 occurrences by checking if current element equals element at slow-2.
# Only place element at slow pointer if it doesn't create more than 2 duplicates.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return len(nums)
        
        slow = 2  # Start from index 2 since first two elements are always valid
        
        for fast in range(2, len(nums)):
            # If current element is different from element at slow-2, it's safe to place
            # This ensures at most 2 occurrences of any element
            if nums[fast] != nums[slow - 2]:
                nums[slow] = nums[fast]
                slow += 1
        
        return slow
