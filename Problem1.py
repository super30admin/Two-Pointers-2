#Remove Duplicates from Sorted Array II

# Time comlexity -> O(n)
# Space complexity -> O1
# Logic -> maitain 2 pointers, slow and fast, fast will take care of occurences, for 1st 2 ocurences it will update the slow with fast value 
# once occurences move above 2 it's just on keeps moving ahead to find new number that needs to be moved in place of slow pointer's value

from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = 0
        length = len(nums)
        count=0
        k = 2
        for fast in range(0,length):
            if (fast != 0 and nums[fast]==nums[fast-1]):
                count+=1
            else:
                count = 1

            if count <=k:
                nums[slow]=nums[fast]
                slow+=1
                
        return slow

