"""
we use two pointers, i and left, such that i traverses the array an slow pointer remains on the last valid element, and later replaces another valid
element found in future. TC is o(n) and sc is o(1)"""

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i] #overwrite the number we want to keep at the slow pointer
                slow += 1
        return slow