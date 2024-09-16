
#Leetcode - This code gives wrong answer on leetcode. I am still working on improving it.

#Explanation- first pointer i is for traversing the entire array and to store the total count
#The second pointer j is used to traverse contiguous duplicate numbers and store inner count 
#If the same number is repeated more than twice, then j is moved to next value

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        inner_count = 1
        total_count = 0
        j = 0
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return 1
        for i in range(len(nums)-2):
            if nums[i] == nums[i+1] and inner_count<2:
                nums[j] = nums[i]
                inner_count += 1
                j += 1
            #elif nums[i] == nums[i+1] and inner_count >= 2:

            else:
                nums[j] = nums[i]
                total_count = total_count + inner_count
                j += 1
                inner_count = 1
        for i in range(len(nums)):
            if i == (len(nums)-2):
                if inner_count<2:
                    nums[j] = nums[len(nums)-1]
                    total_count = total_count+1
                elif inner_count > 2:
                    total_count = total_count+2
                else:
                    total_count = total_count+2
                    nums[j] = nums[len(nums)-1]
        return total_count