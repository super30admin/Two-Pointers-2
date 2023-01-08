'''
Approach 1: Two pointers

insert - this pointer denotes the position to insert elements at
i - this pointer is used to iterate over the list until we find a different element
we return insert to give the actual number of elements that are present after removing duplicates'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        insert = 0
        i = 0
        while(i<len(nums)):
            count, elem = 0, nums[i]
            while(i<len(nums) and nums[i] == elem):
                count += 1
                i += 1
            
            count = 2 if count > 2 else count
            
            while count != 0:
                nums[insert] = elem
                insert += 1
                count -= 1
                
        return insert