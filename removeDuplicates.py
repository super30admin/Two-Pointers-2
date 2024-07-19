# Time Complexity = O(N)
# Space Complexity = O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # Initialize the slow pointer to 1 as the first element is always unique
        slow = 1
        # Initialize count to 1 as we start counting occurrences from the second element
        count = 1
        
        # Iterate through the list starting from the second element
        for i in range(1, len(nums)):
            # If the current element is the same as the previous one, increment the count
            if nums[i] == nums[i-1]:
                count += 1
            else:
                # If it's a new element, reset the count to 1
                count = 1
            
            # If the count is less than or equal to 2, it means the element can be kept
            if count <= 2:
                # Assign the current element to the slow pointer's position
                nums[slow] = nums[i]
                # Move the slow pointer to the next position
                slow += 1
        
        # The value of slow now represents the length of the array with duplicates removed
        return slow
