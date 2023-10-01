'''
1. If length of array is less than or equal to 2, return length of array as we can have atmost 2 unique elements. 
2. Initialize j from 2. If the element at index i is not equal to element at index i-2, then replace the element at index i with element at index j and increment i. 
3. Return i as it is the length of the array with pairs of unique elements.

TC: O(n)
SC: O(1)
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        
        n = len(nums)
        if n <= 2:
            return n
        
        i = 2

        for j in range(2,n):
            if nums[j]!= nums[i-2]:
                nums[i] = nums[j]
                i+=1
        return i   