''' Time Complexity : O(2n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No


   Approach : Maintain two pointers, one to overwirte and one to scan, update the array where count <= k
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        p1 = 0
        i = 0
        count = 0
        while i < len(nums):
            if i != 0 and nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[p1] = nums[i]
                p1 += 1
            
            i += 1
        return p1
        


        