# time complexity: O(n)
# space complexity: O(1)
# Approach: I have used two pointers i and j. I have used a count variable to keep track of the number of times the same element is repeated. If the count is less than or equal to 2, I will replace the element at index j with the element at index i. I will increment j by 1. If the count is greater than 2, I will not replace the element at index j with the element at index i. I will increment i by 1. I will return the value of j which will be the length of the array with at most 2 duplicates.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1
        count = 1
        n = len(nums)

        for i in range(1, n):
            
            if nums[i]==nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count<=2:
                nums[j] = nums[i]
                j += 1
        return j