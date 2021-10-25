#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : yes
#Use two pointers to find and place elements in correct place
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        j = 1
        count = 1
        while(i<len(nums)):
#Increment count if a number is repeated
            if nums[i] == nums[i-1]:
                count += 1
            else:
#If not, set count to 1
                count = 1
#Place next number after maximum 2 occurences of an element
            if count<=2:
                nums[j]=nums[i]
                j += 1
            i += 1
        return j