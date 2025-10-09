# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Approach:
# We use two pointers (slow and fast) to go through the array.
# We keep a count of how many times the current number has appeared.
# If a number appears at most twice, we copy it to the correct position.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0      # Points to the next position where a valid number will be placed
        fast = 0      # Moves through each number in the list
        count = 0     # Tracks how many times the current number has appeared

        # Loop through the entire array
        while fast < len(nums):
            # If the current number is same as the previous one, increase count
            if fast != 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                # If it's a new number, reset count to 1
                count = 1

            # Only keep the number if it appears 2 times or less
            if count <= 2:
                nums[slow] = nums[fast]   # Copy the valid number to 'slow' position
                slow += 1                 # Move slow pointer ahead
            
            # Always move fast pointer to check the next element
            fast += 1
        
        # 'slow' now represents the length of the valid portion of the array
        return slow
