#Time Complexity : O(n) where n is the number of elements in the inpur array
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Keeping a count and two pointers, iterate through the array using one pointer and if current element is equal to previous element, increase count by one, else change count back to one as unique element has been encountered. And if the count is less than equal to 2, then replace repeating element with new unique element and increment pointer.

#Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        j, count = 1, 1
        #iterate through the array
        for i in range(1, len(nums)):
            #if same element increase count of that element
            if nums[i] == nums[i-1]:
                count += 1
            #if unique element is encountered reset counter to 1
            else:
                count = 1
            #if there are less than three repeating elements then replace the repeating element with a unique element
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j
