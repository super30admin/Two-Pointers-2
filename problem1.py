#timecomplexity O(n)
#spacecomplexity O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums==[] or len(nums)==0: return 0
        j=1# keep the record for the result array with 1 duplicate
        count=1# count of the repeated item
        i=1# starting at index 1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[j]=nums[i]
                j+=1
        return len(nums[:j])
    """
      
      j=0# keep the record for the result array with 1 duplicate
        count=0# count of the repeated item
        i=0# starting at index 1
        for i in range(0,len(nums)):
            if i!=0 and nums[i]==nums[i-1]:
                count+=1
            else:
                count=0
            if count<=1:
                nums[j]=nums[i]
                j+=1
        return len(nums[:j])
    
    """