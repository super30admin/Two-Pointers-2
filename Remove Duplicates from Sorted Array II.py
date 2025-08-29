# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: 
# Your code here along with comments explaining your approach: This code removes duplicates from a sorted array such that each element can appear at most twice. It uses two pointers: fast scans the array, and slow tracks the position to place the next valid element, ensuring no more than 2 duplicates are kept. Finally, it returns slow, which represents the new length of the modified array.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        slow = k
        fast = k

        while fast < len(nums):
            if nums[slow - k] != nums[fast]:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow