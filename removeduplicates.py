class Solution:
    def removeDuplicates(self, nums: List[int]) -> int: 
        '''
        resetting when the element is not same as previous
        '''
        '''
        TC : O(N)
        SC : O(1)
        Approach : 
        use two pointer fast and slow.
        keep the count of the current element if the count is more than k skip that element.
        '''
        k = 2
        j = 0
        count = 0
        for i in range(len(nums)):
            if nums[i-1] != nums[i]:
                count = 1
            else:
                count += 1
            if count <= k:
                nums[j] = nums[i]
                j+=1
        return j