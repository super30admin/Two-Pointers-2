# Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# Time Complexity: O(n), fast pointer makes a single pass through the array
# Space Complexity: O(1), only a few extra variables used, no new array created

# We use two pointers: fast to scan through every element, slow to mark where the next valid element goes.
# We count how many times each value repeats consecutively, since the array is sorted.
# If a value has appeared at most twice so far, we keep it by writing it to the slow position.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2       # at most we can keep 2 occurrences of any number
        slow = 0    # next position to write a valid (kept) element
        fast = 0    # current position being scanned
        count = 0   # keeps track of how many times the current value has appeared so far

        for i in range(len(nums)):
            if fast != 0 and nums[fast] == nums[fast-1]:   # we're checking if there's a previous INDEX to compare,
                count += 1   # same value as previous, increase count
            else:
                count = 1    # different value (or first element), reset count to 1

            if count <= k:                # this occurrence is still within the allowed limit
                nums[slow] = nums[fast]   # write it to the next valid slot
                slow += 1                 # move slow forward since we just filled a valid position

            fast += 1   # always move fast forward to check the next element

        return slow   # slow = total count of valid elements kept = k (the answer length)

        