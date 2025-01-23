#Time Complexity = O(1)
#Space Complexity = O(1)
# Approch = iterates through the array while keeping track of the count
#  of each element's occurrences. If an element's count is less than or equal to two,
#  it is written to the current position indicated by a pointer, ensuring duplicates 
#  beyond two are skipped
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s = 0
        count = 0
        for i in range(len(nums)):
            if nums[i] == nums[i-1]:
                count +=1 
            else:
                count = 1
            if count <= 2:
                nums[s] = nums[i]
                s += 1
        return s 