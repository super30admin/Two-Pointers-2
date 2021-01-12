# Created by Aashish Adhikari at 5:13 PM 1/11/2021
'''
Time Complexity:
O(n)

Space Complexity:
O(1)

'''

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        replace_pointer = 0
        check_pointer = 0

        while nums[check_pointer] <= nums[-1]:

            element = nums[check_pointer]

            ctr = 0

            while nums[check_pointer] == element:

                ctr += 1
                check_pointer += 1

                if check_pointer >= len(nums):
                    break

            for idxx in range(0, min(2, ctr)):

                nums[replace_pointer] = element
                replace_pointer  += 1
            if check_pointer >= len(nums):
                break

        return replace_pointer