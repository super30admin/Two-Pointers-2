'''
Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
'''
'''
Time Complexity : O(N)
Space Complexity : O(1)
'''
'''
Approach : 
first i will take 2 pointers i,j from index 1
check if i and i-1 are equal if yes increase count
if not set count to 1
if count <=2 then change nums[j] with nums[i]
and increase j pointer
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1
        count = 1
        for i in range(1,len(nums)):
            if(nums[i] == nums[i-1]):
                count += 1
            else :
                count = 1
            if(count<=2):
                nums[j] = nums[i]
                j += 1
        return j