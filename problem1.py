#Brute force

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        
        while i < (len(nums)-1):
            if nums[i] == nums[i-1] and nums[i] == nums[i+1]:
                nums.pop(i)
                i -=1
            
            i += 1

# Time complexity is O(n^2) where n is the length of the array
# Space complexity is O(1) 
# Approach used: Iterated over the array in a single pass and removed element which equalled previous and next element
           

#Optimized 2 pointer approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count =  1
        fast = 1
        slow = 1
        
        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count +=1
            else: 
                count =1
            if count <=2:
                nums[slow] = nums[fast]
                slow +=1
            fast +=1

        return slow

# Time complexity is O(n) where n is the lenght of the array
# Space complexity is O(1) 
# Approach used: Iterated over the array in a single pass and replaced element when the count is greater than 2
                