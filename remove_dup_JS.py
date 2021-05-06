#Running Time Complexity: O(n)
#Space Complexity: Constant 
#Successfully Run and Compiled on leetcode
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return 0
        j = 1
        count = 1
        target = 2
        for i in range(1,len(nums)):
            #compare i (fast pointer) and j(slow pointer)
            #if count <= target then swap i & j and increase j by 1
            if nums[i]==nums[i-1]:
                count +=1
            else:
                count = 1
                
                
            if count <=target:
                nums[j]=nums[i]
                j +=1
           
        return j 
            