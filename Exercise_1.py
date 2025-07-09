# Time Complexity: O(n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        if not nums:
            return 0

        n = len(nums)
        if n==1:
            return 1

        uniq=1 # increment this index only when this index element does not match the previous 2 elements


        for i in range(1,n):
            # If the current element is same as the elements two places behind, we skip it
            if uniq < 2 or nums[uniq-2]!=nums[i]:
                # the uniq index keeps track of the unique eleements that need to go in the array
                nums[uniq]=nums[i]
            
                uniq+=1

        return uniq