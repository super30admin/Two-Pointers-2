# Time Complexity :
# O(N)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#We store a left pointer and right pointer. The right pointer keeps moving until it finds a new value and keeps a count
#The the left pointer position is updated with the current value (k) times (how many ever repetitions are allowed)
#then right pointer again moves ahead until it finds another new element and above process is repeated

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 0
        right = 0
        
        while (right < len(nums)):
            prev_right = nums[right]
            count = 0
            while (right < len(nums) and prev_right == nums[right]) :
                count += 1
                right += 1
            nums[left] = prev_right
            left += 1
            if count > 1 :
                nums[left] = prev_right
                left += 1

        return left

