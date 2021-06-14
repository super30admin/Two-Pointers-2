"""
Approach: use two pointers, similar to remove duplicates-1 but but track of k
let the duplicates go till k while traversing but reset count to 1 soon after they reach k

"""

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        new_len = 0
        count = 1
        k = 2
        for i in range(1,n):
            if nums[i] != nums[i-1]:
                count = 1
            else:
                count += 1
            if count <= k:
                new_len += 1
                nums[new_len] = nums[i]
        return new_len+1

"""
TC: O(n)
SC: O(1)
"""