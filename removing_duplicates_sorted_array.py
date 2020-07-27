class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #initializing pointers
        slow=1
        fast=1
        flag=0
        prev=0
        while fast<len(nums):
            #condition for duplicates
            if nums[fast]==nums[prev]:
                #condition for 1st duplicate
                if flag==0:
                    nums[slow]=nums[fast]
                    slow+=1
                    fast+=1
                    flag=1
                #skipping next duplicates
                else:
                    fast+=1
            #condition for no duplicates
            else:
                prev=fast
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
                flag=0
        return slow
#Time-Complexity:O(N)
#Space-Complexity:O(1)