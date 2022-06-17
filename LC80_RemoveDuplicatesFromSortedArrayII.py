"""
Remove Duplicates - 
We can use a hashmap or and keep a count 
In a hashmap we can keep a count and till K is achieved, we can keep copying the same element, if its count is greater than the k

BUT to do in place,
we maintain two pointers, Fast, Slow
Fast pointer will traverse through all the elements and slow will only increment if new element is to be inserted, i.e. we will not increment s
if the count crosses K where K is the number of duplicates allowed

In the LC80:https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ we have been given k as 2

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

The same solution can be used for any k : k = 1 which means no duplicates
[So WE CAN REMOVE ALL DUPLICATES IF THE ARRAY IS SORTED WITHOUT AUX SPACE USING THIS SOLN]

TC = O(n)
SC = O(1)
"""

class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        slow = 1
        count = 1
        if len(nums)==0:
            return 0
        for fast in range(1,len(nums)):
            if nums[fast]==nums[fast-1] :
                count+=1

            else:
                count=1

            if count<=2:
                
                nums[slow]=nums[fast]
                slow+=1
        print('updated nums:',nums)
        return slow

  
object = Solution()
nums = [1,1,1,2,2,3]
ans = object.removeDuplicates(nums)
print(ans)

