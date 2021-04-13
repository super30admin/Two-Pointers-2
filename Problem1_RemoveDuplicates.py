# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. To remove duplicates in place with with at most 2 duplicates, consider 2 pointers - slow and fast.
2. Iterate through the loop and if there are more than 2 duplicates, just skip the element by moving the fast pointer.
3. If not, replace the extra duplicates by updating the slow pointer with the fast pointer element.
"""

def removeDuplicates(self, nums: List[int]) -> int:
    if not nums or len(nums) == 0:
        return 0

    slow = fast = 1
    count = 1

    while fast < len(nums):

        # Increment the count if there is duplicate element else reset it.
        if nums[fast] == nums[fast - 1]:
            count += 1
        else:
            count = 1

        # Replace the duplicates
        if count <= 2:
            nums[slow] = nums[fast]
            slow += 1

        fast += 1

    return slow



