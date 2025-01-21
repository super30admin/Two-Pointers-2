#  Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/ 
#  Time complexity: O(n)
#  Space complexity: O(1)

#  Approach:
#  I am using two pointers left and count. 
# I am iterating over the array and checking if the current element is equal to the previous element.
# If it is equal, I am incrementing the count.
# If it is not equal, I am resetting the count to 1.
# If the count is less than or equal to 2, I am updating the left pointer and incrementing it.
# Finally, I am returning the left pointer.


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 1
        count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[left] = nums[i]
                left += 1
        return left