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

# Time: O(n)
# Space: O(1)