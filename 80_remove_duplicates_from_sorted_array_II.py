from typing import List
from collections import Counter


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
            // Time Complexity : O(n)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                    - We start from the slow and fast pointer from the
                      the number of duplicates allowed
                    - The slow pointer points to the position where a new
                      unique element can be inserted
                    - If the current element at the fast pointer is different
                      from two positions before the slow, this means that there
                      are already two duplicates which are same, the new element
                      to be inserted is different, so we insert the fast pointer
                      element to the slow pointer and increment slow pointer.
                    - Always increment fast pointer
        """
        # No of duplicates allowed
        k = 2

        # Since two duplicates are allowed
        # No need to check first two elements
        slow = fast = k

        while fast <= len(nums) - 1:
            if nums[fast] != nums[slow - k]:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow


if __name__ == '__main__':
    h = Solution()
    print(h.removeDuplicates([1, 1, 1, 2, 2, 3]))
    print(h.removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3]))
