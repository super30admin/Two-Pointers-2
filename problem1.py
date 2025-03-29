# Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

# TC : O(n)

# SC : O(1)

# Approach:
    # One pointer (read_index) iterates through the original array
    # Another pointer (write_index) keeps track of where to place the next valid element
    # We allow each element to appear at most twice by comparing the current element with the element two positions back in our result array
    # If they're different, we know it's either a new element or at most the second occurrence, so we include it

# Did this code successfully run on Leetcode : YES

def removeDuplicates(self, nums):
    # Edge cases: empty array or single element
    if len(nums) <= 2:
        return len(nums)
        
    # Initialize position where we'll place next element
    write_index = 2
    
    # Start from the third element
    for read_index in range(2, len(nums)):
        # If current element is different from the element two positions back
        # OR it's the same as the previous but different from two positions back
        if nums[read_index] != nums[write_index - 2]:
            nums[write_index] = nums[read_index]
            write_index += 1
            
    return write_index