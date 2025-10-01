"""
Start slow and fast from index k since first k elements are always allowed.
Only copy current fast element to slow if it's different from the element k places behind.
This ensures each number appears at most k times in the result.

"""
#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution:
    def removeDuplicates(self, nums):
        k = 2
        slow = k
        fast = k

        while fast < len(nums):
            if nums[slow - k] != nums[fast]:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1

        return slow