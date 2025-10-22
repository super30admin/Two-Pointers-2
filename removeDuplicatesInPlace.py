class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Two-pointer approach: Use 'slow' pointer to track position for valid elements,
        and 'i' pointer to scan through array, keeping count of consecutive duplicates.
        Time Complexity: O(n) - single pass through the array
        Space Complexity: O(1) - only using constant extra space (pointers and counter)
        """
        
        k = 2  # Maximum allowed occurrences for each unique element
        
        # Start slow pointer at index 1 (first element at index 0 is always valid)
        slow = 1
        
        # Track consecutive occurrences of current element (starts at 1 for nums[0])
        count = 1
        
        # Iterate through array starting from index 1
        for i in range(1, len(nums)):
            
            if nums[i] == nums[i-1]:
                # Current element equals previous element - increment occurrence count
                count += 1
            else:
                # New element encountered - reset count to 1
                count = 1
            
            # Only include element if it hasn't exceeded max allowed occurrences (k)
            if count <= k:
                # Place current element at slow pointer position
                nums[slow] = nums[i]
                # Move slow pointer forward to next available position
                slow += 1
            # If count > k, skip this element (don't advance slow pointer)
        
        # Return the length of the modified array (slow pointer is at next empty position)
        return sloww the e