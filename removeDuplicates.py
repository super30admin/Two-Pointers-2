"""
Approach 1: In this we can simply use hashmap to do a first pass and count numbers and in second pass overright the nums
Accepted in LC : yes
TC: O(n) - we go over nums 2 times so O(2n) -> O(n)
SC: O(n) in the worst case - as we will have to store each number in the dict
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        dups =2
        d= dict()
        for n in nums:
            if n in d and d[n] < dups:
                d[n] +=1
            elif n not in d:
                d[n] =1

        loc = 0
        
        for k in nums:
            while d[k] > 0 and d[k] <= dups:
                nums[loc] = k
                loc +=1
                d[k] -=1
                
        
        return loc
"""
Approach2 : 2 pointers
fast pointer f keeps moving 1 step at a time from idx 1..n
on every step, checks if prev num and curr num is same
if so, increment count
when that doesn't happen, we arrived on a new/different num
so we reset count to 1 again
Another if condition in the loop separate from the first if/else
is to check when count <= dups
as long as that's the case :
overright nums[slow] with nums[fast]
and incr slow pointer
if that is not the case we do not overright
slow pointer is already automatically at next location where we 
can copy the next number
in the end return slow pointer, any remaining nums after that location are considered extra
and leetcode test function ignores it

TC : O(n)
SC: O(1)
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        dups =2 # we can configure how many duplicates we allow
        slow=1 # slow pointer starts at idx 1 in the array
        count=1 # count is set to 1 because we already kept whaterver number we have at idx 0
        
        for f in range(1,len(nums)):
            if nums[f-1] == nums[f]:
                count+=1
            else:
                count =1

            if count <= dups:
                nums[slow]=nums[f]
                slow+=1
        return slow