'''
    Time Complexity:
        O(n) (where n = length of the array)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Two pointer.
        First number itself is sorted. So start wth the second one.
        You also maintain a variable to point to the last sorted index.
        Keep count of the same numbers.
        If current number == previous number:
            -> Incremenet the count.
        Else
            -> Set the count = 1.
        If at any point, the count <= 2, that means we can keep this number.
            -> Incremenet the last sorted index and copy this number to it.
        Return the length of the sorted (= sorted index + 1).
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curr_count = 1
        last_sorted_idx = 0
        for idx in range(1, len(nums)):
            if nums[idx] == nums[idx - 1]:
                curr_count += 1
            else:
                curr_count = 1

            if curr_count <= 2:
                last_sorted_idx += 1
                nums[last_sorted_idx] = nums[idx]

        return last_sorted_idx + 1
