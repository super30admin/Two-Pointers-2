# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Instead of using hashmap to get frequency of all numbers and using a pointer to get the next unique element, we can use 2 pointers - slow and fast and use a count variable to replace hashmap.
# We can use fast pointer to get the next unique element and get count of each unique element, until count<=k (2) write nums[fast] into nums[slow], the moment it become greater than k just use fast and go to the next element.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums or len(nums)==0: return 0
        slow=0
        count=1 #count is 1 because we are comapring current num with previous, if not equal count is 1 by default
        k=2
        for fast in range(len(nums)):
            if fast>0 and nums[fast]==nums[fast-1]: #get count 
                count+=1
            else:
                count=1
            
            if count<=k: #the moment count<=k overwrite nums[slow] with nums[fast] and increase slow
                nums[slow]=nums[fast]
                slow+=1
        return slow
