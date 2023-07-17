#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
#Use 2 pointers- slow and fast(i), check if the previous element is same as the current element, then increment the count - else reset count to 1. if count <=2 then swap the elements at slow and fast pointer, and increment slow pointer.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow=0
        count=0
        for i in range(len(nums)):
            print(i)
            if i!=0 and nums[i]==nums[i-1]:
                count+=1
            else:
                count=1

            if count<=2:
               nums[slow]=nums[i]
               slow+=1
                
        return slow