#Time complexity : O(n)
#Space Complexity : O(1)
#Did your code run on leetcode : yes
#approach : slow and fast pointers

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #to exclude first element in the list
        slow = 1
        #considering the first element
        count = 1
        
        #fast pointer here is i
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
            
        return slow
