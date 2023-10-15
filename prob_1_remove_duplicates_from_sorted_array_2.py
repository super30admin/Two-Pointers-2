class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - if the array size is 1 return 1
            - if not, we will traverse the array from index 1
            - We will compare the value at current index with previous index
            - If the value is same we will increase the counter by 1 
                - if the counter is <= 2 (k)
                    - we will replace the value at pointer index with current index
                    and increase the counter by 1 
            - If the value is not the same 
                - we will change the counter value to 1 
                and swap the pointer value with the current value 
                - we will increment the pointer value here as well
            - Return pointer value 
        """        
        k = 2
        if len(nums) == 1: return 1
        count = 1
        p1 = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
                if count <= k:
                    nums[p1] = nums[i]
                    p1 += 1
            else:
                count = 1
                nums[p1] = nums[i]
                p1 += 1
        return p1
