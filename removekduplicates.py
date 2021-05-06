"""Remove Duplicates from Sorted Array II
Time Complexity - O(n)
Space Complexity -O(1)

approach -> 2 pointers j pointer collects the legitimate values - slow pointer. i pointer is the iteration pointer fast pointer"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
    #
        if (nums ==None) and (len(nums)==0):
            return 0
        count =1
        j =1
        k =2 # number of duplicates allowed
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                count+=1
            else:
                count =1
            if count<=k:
                nums[j] = nums[i]
                j+=1
        return j
        
    