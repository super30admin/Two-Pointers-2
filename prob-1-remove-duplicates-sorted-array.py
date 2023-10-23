class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        """

        NOTE: Each unique element can appear at most twice. Keep a count of it.
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No

        """
        
        max_allowed = 2 # Generalize the solution by keeping track of the maximum frequency allowed for an element
        curr_insert = 0 # curr_insert tracks where we are going to insert/OVERWRITE the element in the array
        count_freq = 1 # How many times have the element appeared?

        # We use 2 pointers.
        # i processes each element in the array. Second is curr_insert
        for i in range(0, len(nums)):
            # Since we check for i==0 in the first clause using OR, it prevents the 2nd clause from evaluation. 
            # Otherwise it would have given out-of-bounds exception
            if (i == 0) or (nums[i] != nums[i-1]): 
                count_freq = 1
            else:
                count_freq += 1
            # Now decide whether 
            # If at the first element or 
            # current != previous or
            # current = previous AND count_freq < max_allowed
            if (i == 0) or (nums[i] != nums[i-1]) or (nums[i] == nums[i-1] and count_freq <= max_allowed):
                nums[curr_insert] = nums[i]
                curr_insert += 1
            else:
                count_freq += 1
            
        return curr_insert
