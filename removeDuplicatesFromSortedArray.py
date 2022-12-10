# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

class solution:
    def removeDuplicates(self, nums):
        ## this is a tricky question. here what we do is have a slow pointer starting from 1 and the count also as 1 .
        ## this is because the first element is always unique , so we start from the next. now we iteratore from index 1 
        ## to end and see if nums[i] == nums[i-1] this means that we are checking so that we know if we can increase count or 
        ## reinitialize it to 1. Now we check if this count <= 2(k) if it is so we get the value at nums[i] and place it in nums[slow]
        ## and increment the slow pointer. At the end we will return slow. which is the end the array.

        slow = 1
        count = 1
        k = 2
        for i in range(1,len(nums)):
            if nums[i] != nums[i-1]:
                count = 1
            else:
                count+=1
            
            if count <= k:
                nums[slow] = nums[i]
                slow+=1

        return slow

        
