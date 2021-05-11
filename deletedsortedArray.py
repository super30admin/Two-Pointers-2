from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int],k: int) -> int:
        if nums is None or len(nums)==0:return
        count=1
        j=1
        for id in range(1,len(nums)):
            if nums[id]==nums[id-1]:
                count+=1
            else:
                count=1
            if count<=k:
                nums[j]=nums[id]
                j+=1
        return j


#time:-O(n)
# space:-O(1)
















if __name__ == '__main__':
    print(Solution().removeDuplicates(nums=[1,1,1,2,2,3],k=2))
