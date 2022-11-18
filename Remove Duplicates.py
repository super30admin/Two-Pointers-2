class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=1
        j=1
        count=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count=count+1
            else:
                count=1
              
            if count<=2:
                nums[j]=nums[i]
                
                j=j+1

        return j

#Time Complexity is O(n)
#Space Complexity is O(1)

