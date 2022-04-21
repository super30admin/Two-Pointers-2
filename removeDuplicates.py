class Solution:
    '''
    Dry Run ( 00:50:00 to 1:00:10 ) : https://www.youtube.com/watch?v=S_NxQDRlWcc&list=PLWtKyKogBpBCIwYoD3sbtD_-e9vVqlZnV&index=26&t=1s
    T = O(N)
    S = O(1)
    '''
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums: return 0 
        j = 1 
        count = 1 
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1 
            else:
                count = 1 
            if count < 3:
                nums[j] = nums[i]
                j += 1
        return j
    
    
