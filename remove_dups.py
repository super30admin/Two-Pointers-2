class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        read = 1
        write =1
        count=1
        while read<len(nums):
            if nums[read]==nums[read-1]:
                count+=1
            else:
                count=1

            if count<=2:
                nums[write]=nums[read]
                write+=1

            

            read+=1
        return write
