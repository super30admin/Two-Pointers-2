class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        '''
        # O(n^2)
        i=0
        j=1
        if(len(nums)<=2):
            return len(nums)
        
        while(i<len(nums) and j<len(nums)):
            
            while(j<len(nums) and nums[j]==nums[i]):
                j+=1
            
            if(j-i<=2):
                i = j
                j = i+1
            
            else:
                while(j-i>2):
                    nums.pop(i)
                    j-=1
                i = j
                j = i+1
        
        return len(nums)
        '''
        # Complexity: Time- O(n), Space: O(1)
        if(len(nums)<=2):
            return len(nums)
        
        j, count = 1, 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j
