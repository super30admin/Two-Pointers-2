class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 1

        j = 1
        # nums1=nums
        for i in range(1, len(nums)):
            if nums[i - 1] == nums[i]:
                count += 1

            else:
                count = 1
            if count <= 2: #replace 2 with 1 if you want no duplicates
                nums[j] = nums[i]
                j += 1
        return j


    # time=O(n) space-O(1)