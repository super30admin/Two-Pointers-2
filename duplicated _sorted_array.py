def removeDuplicates(self, nums: List[int]) -> int:
    #TC: O(n) SC:O(1)
        slow=0
        count=0
        n=len(nums)
        for i in range(n):
            if i ==0:
                count=1
            elif nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[slow]=nums[i]
                slow+=1
        return slow
        