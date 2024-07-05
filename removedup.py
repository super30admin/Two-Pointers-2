class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #it should have slow and fast pointer, fast keeps indexing track, 
        #slow keeps the position it needs to be swapped into, slow is updated
        #only if count<=2, if prev!=currelem then count is recent to 1, 
        #showing we found a new elem with count 1

        n=len(nums)
        slow=0
        count=1
        for fast in range(1, n):
            if nums[fast]==nums[fast-1]:
                count+=1
            else:
                count=1

            if count<=2:
                slow=slow+1
                nums[slow]=nums[fast]
                
                #slow=slow+1 
                #if we do here, it becomes like we're updates 0 
        return slow+1