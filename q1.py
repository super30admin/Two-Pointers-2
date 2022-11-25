from typing import List
# Time Complexity : O(n), Where n is number of elements in nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
'''
Here we will iterate through the each element using i, 
If nums[i]==nums[i-1] increment the count else make count=1, 
Afterwards we will check the count<=2, If yes we will assign value at j index else we won't assign value at j index
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #we no need to modify the first element
        count=1
        #j is used to keep track of the index where we need to put our next element
        j=1
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                count=count+1
                #print(count)
                if(count<=2):
                    #output.append(nums[i])
                    nums[j]=nums[i]
                    j+=1
                    
            else:
                count=1
                #output.append(nums[i])
                nums[j]=nums[i]
                j+=1
        #print(nums)
        #print(j)
        return j