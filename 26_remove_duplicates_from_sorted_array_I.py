from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
            // Time Complexity : O(n)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                    - Use slow and fast pointers
                    - If the current value of fast pointer is same as the previous value,
                      it means its a duplicate. Skip it
                    - Else if different, change slow pointer value with the fast pointer as
                      its a unique element.
        """
        # edge case
        if not nums:
            return

        k = 1  # no of duplicates allowed

        # one element cannot be a duplicate
        # start from the first index
        slow = fast = k
        # fast pointer is used to traverse
        # all the elements

        while fast <= len(nums) - 1:
            # slow is the current position,
            # where a unique element can be inserted
            # if the current fast pointer element is
            # different from the previous slow element
            # this a unique element can be inserted at the
            # slow pointer position
            if nums[fast] != nums[slow - 1]:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow

        # slow, fast = 0, 1
        #
        # while fast <= len(nums) - 1:
        #     # case 1
        #     # same elements
        #     if nums[fast] == nums[fast - 1]:
        #         fast += 1
        #
        #     # case 2
        #     # different elements
        #     else:
        #         slow += 1
        #         nums[slow] = nums[fast]
        #         fast += 1
        # return slow + 1


if __name__ == '__main__':
    h = Solution()
    print(h.removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]))
