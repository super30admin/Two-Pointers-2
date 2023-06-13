#Time complexity is: O(n) where n is the number of values in the nums array
#Space complexity is: O(1)
#Program ran successfully on leet code
#No issues faced while coding the problem

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #Initializing the required values
        slow=0
        count=1
        for i in range(1,len(nums)):
            #If the current value is equal to previous values, we will increase the count by 1
            if(nums[i]==nums[i-1]):
                count+=1
            #If the previous and the current values are different, we will initialize the count value to 1
            else:
                count=1
            #If the count is less than 2 we will move the count pointer 1 step forward
            #We will move the vaue present at ith index to slow index 
            if(count<=2):
                slow+=1
                nums[slow]=nums[i]
        #Finally we will be returning position in the array where we placed the last value
        return slow+1

