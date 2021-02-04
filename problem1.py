// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count=j=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:                          //check for duplicate values
                count+=1
            else:
                count=1
            if count<=2:                                  //if element has 2 or less duplicates then we can assign the value at index i to value at index j because j is either pointing to the index i or it is pointing to the extra duplicate
                nums[j]=nums[i]
                j+=1
        return j
