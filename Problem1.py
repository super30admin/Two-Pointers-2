

# // Time Complexity :O(N)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Three line explanation of solution in plain english
# Important thing to note is this array is sorted,we will have 2 pointer one read pointer and one write pointer ,write pointer will be stuck after k reaches limit
# // Your code here along with comments explaining your approach
# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0  # write pointer
        c = 1  # count of current element
        k = 2  # max allowed duplicates
        n = len(nums)
        
        nums[l] = nums[0]  # first element is always valid
        l += 1
        
        for i in range(1, n):
            if nums[i-1] == nums[i]:
                c += 1
            else:
                c = 1
            
            if c <= k:
                nums[l] = nums[i]  # write current element, not next
                l += 1
        
        return l  # l is already the length
