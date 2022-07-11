# Time complexity: O(n)
# Space complexity: O(1)
# Approach: initialise count as 0, start from index 1
# use two pointers i and j and start from index 1
# run the loop till i is at last index
# check element at index i and element before index i
# if same, increment count
# if count is less than or equal to 2, swap i and j elements

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1
        n = len(nums)
        count = 1
        if n <= 2:
            return n   
        for i in range(1,n):
            if nums[i]==nums[i-1]:
                count = count + 1
            else:
                count = 1
            if count <= 2:
                nums[j]=nums[i]
                j = j+1
        return j
            
        