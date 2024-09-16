#Time Complexity:O(n)
#Space Complexity:O(1)

#Ran successfully on Leetcode:Yes
#I am using twp pointers, opne slow and another fast. 
#the fast pointer iterates through the whole array. 
#And the slow pointer is incremented only when it finds a unique number. 
#SInce we are removing duplicates appeared more than twice I am using slowPtr-2 to comopare it with other numbers 
#in the array uusing fast pointer. 

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if (len(nums))<3:
            return (len(nums))
        slowPtr=2
        for fastPtr in range(2,len(nums)):
            if nums[slowPtr-2]!=nums[fastPtr]:
                nums[slowPtr]=nums[fastPtr]
                slowPtr+=1
        # for delete_index in range(fastPtr, slowPtr-1, -1):
        #     del nums[delete_index]
        return slowPtr
