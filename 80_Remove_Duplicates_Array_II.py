# Leetcode problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n*2) => Start from each element and maintain a flag if its the first encounter of the element. If its the first encounter, increase the index, if its the second encounter change the flag to False and remove all the duplicate elemenets from the array. Change the flag to true again. Continue with the next element and so on and so forth

        Optimized approach: O( n ) => Keep two pointers, one which is traversing the array(fast) and second which points to the next position where element needs to be udpated. 
        In order to make sure atmost one duplicate elements are present, keep a flag (default as False) and update the flag to true when the first duplicate is found. If the element is same as previous and duplicate flag is true that means we have already encountered one duplicate element earlier. So we keep increasing the fast pointer to the point where element isnt the same anymore and change the duplicate flag to False again
'''
      

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # edge case when array is empty
        if not nums or len(nums) == 0:
            return
        # slow pointer will start from first position
        slow = 0
        # fast will start from next position as we want to check for the next duplicate and traverse
        fast = 1
        # by default flag is set to False
        dup = False
        
        # traverse the elements in array till fast reaches the end
        while fast < len(nums):
            # previous element encountered is same as current element
            if nums[slow] == nums[fast]:
                # if flag is set to true that menas this element is encountered more than twice
                if dup:
                    # keep traversing the array till the element isnt same anymore or end is reached
                    while fast < len(nums) and nums[fast-1] == nums[fast]:
                        fast += 1
                    # as element isnt the same duplicate flag will cange to False
                    dup = False
                # first duplicate of the previous element
                else:
                    # change flag to True
                    dup = True
                    # update the value to the next position
                    slow += 1
                    nums[slow] = nums[fast]
                    fast += 1
            # is element isnt the same as previous one then just icnrement both pointers and copy the value
            else:
                slow += 1
                nums[slow] = nums[fast]
                fast += 1
                dup = False
        # slow pointer signifies last updated index so length will be 1+index
        return slow+1
        