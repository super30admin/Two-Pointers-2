class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        """
        TC: O(n)
        SC: O(1)
        """
        
        # 1. base case
        if nums == None or len(nums) == 0:
            return 0
        
        # when nums is not empty
        
        n = len(nums)
        count = 1
        j = 1
        
        for i in range(1, n):
            # get the count of the same elements
            if nums[i-1] == nums[i]:
                count += 1
            else:
                count = 1
            
            # when count is less than 3
            # replace the jth elem with ith elem to keep the max count 2
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        
        # return the size of the new updated array
        return j