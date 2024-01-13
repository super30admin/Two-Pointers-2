""" Explanation: We start with having two pointers, left and right. Since each element can only appear twice, we aim to start both the 
    pointers at index 2. We then iterate through the array and check if the element at the right pointer = to elmenent at left -2 since 
    that way we can check the first index and two elements after that. If that's the case, we make the left and right pointer equal and
    increment them accordingly.
    Time Complexcity: O(n)
    Space Complexcity: O(1)
"""


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        left, right = 2,2

        while right<len(nums):
            if nums[right]!=nums[left-2]: 
                nums[left]=nums[right]
                left+=1
            right+=1
            
        return left