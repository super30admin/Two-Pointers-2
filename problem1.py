class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        ele, count,i = nums[0], 1,1
        #print(nums, len(nums))
        while i< len(nums): #nums length changes after each iteration
            #print(i, nums[i:])
            if nums[i] == ele: #either increment the count of repeated element or reinitialize count snf ele variable
                count+=1
                if count>2:
                    del nums[i]
                else: i+=1
            else:
                ele = nums[i]
                count =1
                i+=1
        
        return len(nums)


# Time complexity -O(N) 
#space complexity O(1)