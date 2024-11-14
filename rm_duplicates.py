# The code defines a removeDuplicates method to remove duplicates from a sorted array, allowing each unique element to appear at most twice.
# The method modifies the array in place and returns the new length of the modified array.

# Initial Setup:
#   - 'n' stores the length of the nums array.
#   - If the array has fewer than 3 elements, return n directly since no duplicates can exceed the allowed count of two.

# Main Loop:
#   - Initialize 'i' to 2, representing the position where the next unique element (appearing at most twice) will be placed.
#   - Iterate over the array starting from index 2 (stored in 'j'):
#       - If the current element nums[j] is different from nums[i - 2] (meaning it can appear at this position without exceeding the limit of two occurrences):
#           - Set nums[i] to nums[j], effectively keeping the element in the array.
#           - Increment 'i' to update the position for the next allowable element.
#   - This ensures that no element appears more than twice and that the array is compacted in place.

# Final Result:
#   - The method returns 'i', which represents the new length of the array with duplicates removed according to the criteria.

# TC: O(n) - Each element is processed once, making the time complexity linear.
# SC: O(1) - The space complexity is constant as the array is modified in place with no extra space used.


from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n < 3:
            return n
        
        i = 2
        for j in range(2, n):
            if nums[j] != nums[i - 2]:
                nums[i] = nums[j]
                i += 1
                
        return i