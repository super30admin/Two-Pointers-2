#Time Complexity - O(n)
# Space - O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """ Function removes elements if they have more than two duplicates, we use
        two pointers, one to keep track where was the last duplicate element found and one at the current
        value, replace the values at duplicate element with current value till we have less than/equal to two values
        """
        last_non_dup = 0
        num = float("-inf")
        index = 0
        count=0
        while(index<len(nums)):
            # print(index)
            if nums[index]!=num:
                num =nums[index]
                count=0
            if count>=2:
                index+=1
            # else:
            elif count<2 and index<len(nums):
                while(index<len(nums) and last_non_dup<len(nums) and nums[index]==num and count<2 ):
                    # print(index,last_non_dup,num)
                    count+=1
                    nums[last_non_dup]=num 
                    last_non_dup+=1
                    index+=1
        # print(last_non_dup,nums)
        return last_non_dup
        