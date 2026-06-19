## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# Time Complexity: O(n), where n is the length of the nums array.
# Space Complexity: O(1), as the modifications are done in-place.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # Edge case: if the list is empty, return 0 (though constraints usually guarantee at least 1 element)
        if not nums:
            return 0
            
        # 'slow' pointer tracks the position where the next valid element should be written.
        # It starts at 1 because the first element (index 0) is always valid.
        slow = 1
        
        # 'count' tracks the frequency of the current element we are observing.
        # It starts at 1 because we have already "seen" the first element at index 0.
        count = 1
        
        # 'fast' pointer iterates through the array starting from the second element.
        for fast in range(1, len(nums)):
            # If the current element matches the previous element, increment its frequency count.
            if nums[fast] == nums[fast - 1]:
                count += 1
            # If it's a new element, reset the frequency count to 1.
            else:
                count = 1
            
            # If the current element has appeared 2 or fewer times, it is valid to keep.
            if count <= 2:
                # Write the element at the 'fast' pointer to the 'slow' pointer's position.
                nums[slow] = nums[fast]
                # Advance the 'slow' pointer to prepare for the next valid element.
                slow += 1
                
        # The 'slow' pointer represents the length of the new valid array.
        return slow