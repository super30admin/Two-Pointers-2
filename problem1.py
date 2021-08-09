#remove duplicates from sorted arrya
#leetcode solution accepted
#time complexity: O(n) where n is the size of array
#space complexity: O(1) since we are chaing it in place

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
         
        if len(nums)<2:
            return len(nums)
        slow = 2
        fast = 2
        while fast<len(nums):
            if nums[slow-2] !=nums[fast]:
                nums[slow]=nums[fast]
                slow+=1
            fast+=1
        return slow