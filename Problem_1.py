"""
Problem : 1

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Creating two pointer to iterate over the array, finding the multiple occurences of the same element
then increasing the counter and pushing the counter forward, if another element found then resetting
the counter and repeating the iteration

"""

# Remove Duplicates

class Solution(object):
    def removeDuplicates(self, nums):

        if nums==None or len(nums)==0:
            return 0
        slow=0
        count=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            
            if count<=2:
                slow+=1
                nums[slow]=nums[i]
        return slow+1