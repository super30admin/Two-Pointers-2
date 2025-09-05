'''
We maintain slow and fast pointer. 
    - Slow: catch the elements that need to be filled in 
    - fast: iterator over the array
We maintain a count variable, counting the occurances of fast pointer. 
    if nums[fast]==nums[fast-1]:
        count+=1
    if count<=at_most:
        nums[slow] = nums[fast]
        slow+=1
    fast+=1 # we always move fast 
Time Complexity: O(N)
Space Complexity: O(1)
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = 0
        count = 0

        at_most = 2
        while fast<=len(nums)-1:
            if fast==0 or nums[fast]==nums[fast-1]:
                count+=1
            else:
                count = 1 # reset the count, we found unique element
            
            if count<=at_most:
                nums[slow] = nums[fast] # either unique, or repeated element less than at_most
                slow+=1
                fast+=1
            else:
                fast+=1 # we have filled up at_most count of current element, keep iterating until we find unique

        return slow # since slow has already moved 1 idx ahead, it will capture the length            