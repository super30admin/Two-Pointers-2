# Created by Aashish Adhikari at 2:41 PM 1/11/2021

'''
Time Complexity:
O(n) + O(max_num in input)


Space Complexity:
O(n)
'''

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        hm = {}

        for idx in range(len(nums)):

            if nums[idx] not in hm:
                hm[nums[idx]] = 1
            else:

                hm[nums[idx]] = 2

        ptr = 0
        idx = nums[0]
        while idx < nums[-1] + 1:

            if idx in hm:

                if hm[idx] == 1:

                    nums[ptr] = idx
                    ptr += 1
                else:

                    nums[ptr] = idx
                    nums[ptr+1] = idx
                    ptr += 2
            idx += 1

        return ptr



