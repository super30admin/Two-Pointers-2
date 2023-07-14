# Time: O(n), n is length of nums
# Space: O(1)
# did this code run? yes
# issues faced: None
#Approach:
# for each new element we encounter, move a pointer until it points to a new element and count the occurences.
# based on the occurences update it in the non duplicate subarray using another pointer and increment it.
# the index of this pointer pointing to new subarray is the answer

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        prev, curr, n = 0, 0, len(nums)
        while curr < n:
            ele, cnt = nums[curr], 0
            while curr < n and nums[curr] == ele:
                cnt+=1; curr+=1
            if cnt < 2:
                nums[prev] = ele
                prev+=1
            else:
                nums[prev], nums[prev+1] = ele, ele
                prev+=2
        return prev