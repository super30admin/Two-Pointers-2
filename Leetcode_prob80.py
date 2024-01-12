#time complexity: O(n)
#space complexity: O(1)
#Approach: Two pointers
#1. Initialize two pointers l and r at 0th index.
#2. Iterate through the array and count the number of occurances of each element.
#3. If the count is less than 2, then we can replace the element at lth index with the element at rth index.
#4. Increment l and r by 1.
#5. Return l.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l, r = 0, 0

        while r < len(nums):
            count = 1
            while r + 1 < len(nums) and nums[r] == nums[r + 1]:
                r += 1
                count += 1
            
            for i in range(min(2, count)):
                nums[l] = nums[r]
                l += 1
            r += 1
        return l