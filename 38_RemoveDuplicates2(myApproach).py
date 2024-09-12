# accepted in leetcode
# time - O(N), space -O(1)
# iterating through elements and just skipping the element if it is repeated more than twice.
class Solution:
    def removeDuplicates(self, nums) -> int:
        i = 0
        for n in nums:
            if i >= 2 and n > nums[i-2]:
                nums[i] = n
                i += 1
            elif i<2:
                i=i+1
        return i