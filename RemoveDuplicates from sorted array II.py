class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        slow=1
        count=1
        n=len(nums)

        for i in range(1,n):
            if nums[i]==nums[i-1]:
                count=count+1
            else:
                count=1
            if count<=2:
                nums[slow]=nums[i]
                slow=slow+1
        return slow        