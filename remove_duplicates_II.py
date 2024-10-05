"""
Approach1: Store the frequency of each integer in the hash map, key as integer and frequency as value and then
traverse the hashmap from min to max value and if freq is >= 2, add that integer 2 times and if it is less than 2
add it freq times.
Time complexity: O(n) + O(n), sc: O(n)

Approach 2: 2 for loops, one to traverse the array and another to count the frequency of each integer and based on it
update the answer. TC: O(n^2) and SC: O(n)

Approach3: 2 pointers approach. one pointer keeps track of the place where the next unique integer will come and
another pointer to find the unique element. TC: O(n) and SC: O(1).
The idea is to write the logic/condition one by one. For example, how to find the next unique integer?
, if you found the next unique integer, what would you do?

"""
from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        i, j, count = 0, 0, 0
        k = 2
        while j < len(nums):

            # find the unique integer and keeping incrementing its frequency.
            # once unique is found, update count to 1.
            if j > 0 and nums[j] == nums[j - 1]:
                count += 1
            else:
                count = 1

            # if the count is less than 2 keep incrementing i and update i index with j value
            if count <= k:
                nums[i] = nums[j]
                i += 1

            j += 1

        return i
