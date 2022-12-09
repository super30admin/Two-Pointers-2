#Time Complexity :  O(n)
#Space Complexity :  O(1)
#Did this code successfully run on Leetcode : Yes

#code along with comments 
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1                           #initialize count and slow to 1
        slow = 1
        for i in range(1,len(nums)):        #start i from first index
            if nums[i] == nums[i-1]:        #if nums[i] == nums[i-1]
                count += 1                  #we increment count by 1
            else:                   
                count = 1                   #if they are not same we reset count to 1
            
            if count <= 2:                  #if count <= 2
                nums[slow] = nums[i]        #we replace elem at nums[i] to nums[slow]
                slow += 1                   #and increment slow count by 1
            
        return slow                         #finally we return slow where all elements to left of slow will have duplicates removed
