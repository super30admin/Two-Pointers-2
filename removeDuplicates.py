class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        slow = 1
        counter = 1
        
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast-1]:
                counter+=1
            else:
                counter = 1
            
            if counter<=2:
                nums[slow] = nums[fast]
                slow += 1
        
        return slow
    

#  time complexity is O(n), approach is to keep one fast and one slow pointer, fast will iterate through the array and elements at slow and fast are swapped when count is less than 2. counter is counting repeating elements.
            
            
        
        
