# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
# Time O(N) : Iterate over nums array once of length N
# Space O(1) : No extra space used, modified in-place

class Solution:
    def removeDuplicates(self, nums):
        # Use fast pointer to iterate over nums and slow to stop at positions to replace nums
        
        count = 1
        slow = 1
        #Start from 1 as minimum 1 number is allowed in the array, i is the fast pointer
        for i in range(1, len(nums)):
            
            if nums[i] == nums[i-1]:
                count += 1
            else:
                #reset count
                count = 1
                
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        return slow

nums = [0,0,1,1,1,1,2,3,3]
s = Solution()
output = s.removeDuplicates(nums)
print(nums[:output])