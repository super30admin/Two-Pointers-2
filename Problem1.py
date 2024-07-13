#I used a two-pointer technique to solve this problem efficiently. I keep track of the current position (index) where I should place the next valid number, and I also count the occurrences of each number. As I iterate through the array, I check if the current number is the same as the previous one. If it is, I increment the occurrence count; if not, I reset it to 1. The key is that I only copy a number to the 'index' position if its occurrence count is 1 or 2. This way, I ensure that no element appears more than twice in the final array. After processing all numbers, the 'index' variable represents the length of the new array with duplicates removed. This approach allows me to modify the array in-place and achieve the desired result in a single pass through the array.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        index = 1
        occurance = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                occurance += 1
            else:
                occurance = 1

            if occurance <= 2:
                nums[index] = nums[i]
                index += 1
        
        return index