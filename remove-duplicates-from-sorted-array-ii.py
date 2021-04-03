# Time Complexity : O(n), where n is the size of the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        # slow pointer keeps track of where the non-duplicate elements need to be inserted
        slow = 1
        # fast pointer keeps track of the count of the current element
        fast = 1
        count = 1

        while fast < len(nums):
            if nums[fast - 1] != nums[fast]:
                count = 1

            else:
                count += 1

            # we need to retain only 2 copies
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
                fast += 1

            # skip the rest of the copies
            else:
                fast += 1

        return slow
