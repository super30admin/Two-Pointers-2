#Approach
# if the number-k is same number as the or count is k then we need to retain the element if moreduplicates than k then donot increment k
# If new number is found replace in the ith position

#Comlexities
# Time Complexity: O(n)
# Space Complexity: O(1)



from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for n in nums:
            if i < 2 or n > nums[i - 2]:
                nums[i] = n
                i += 1
        count = i
        while i < len(nums):
            nums[i] = '_'
            i += 1
        return count


s =  Solution()
print(s.removeDuplicates([1,1,1,2,3,3,3,4,4]))