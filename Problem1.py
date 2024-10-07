class Solution(object):
    def removeDuplicates(self, nums):
        # Approach:
        # 1. Use two pointers: 'slow' to track the position for writing unique elements,
        #    and 'fast' to iterate through the list.
        # 2. Maintain a count of duplicates. If the count exceeds 'k' (which is 2),
        #    skip the element. Otherwise, copy it to the 'slow' index.
        # 3. At the end, 'slow' will represent the length of the modified list 
        #    with at most 'k' duplicates of any element.

        # Time Complexity: O(n), where n is the length of the input list 'nums'.
        # Space Complexity: O(1), since we are using only a constant amount of space 
        # (variables 'slow', 'fast', 'count', and 'k').

        slow, fast = 0, 0
        count = 0
        k = 2

        while (fast < len(nums)):
            if fast > 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1

            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1

        return slow
