# Approach:
# Use a pointer to place elements in the desired position and only add each unique element up to two times.
# Traverse the array and for each element, check if it can be added by ensuring it is either the first element or not more than twice the previous element.
# This maintains relative order and avoids duplicates beyond the second occurrence in-place.

# Time Complexity: O(n), where n is the number of elements in nums
# Space Complexity: O(1), as we modify the array in-place without extra memory
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No



class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 2:  # If the array has 2 or fewer elements, all can remain
            return len(nums)
        
        insert_pos = 2  # Start insertion from index 2 since the first two elements can stay

        for i in range(2, len(nums)):
            # Check if the current element is different from the element two positions back
            if nums[i] != nums[insert_pos - 2]:
                # Place the current element at the insert position and increment insert position
                nums[insert_pos] = nums[i]
                insert_pos += 1

        return insert_pos  # Length of array with duplicates removed up to two occurrences
