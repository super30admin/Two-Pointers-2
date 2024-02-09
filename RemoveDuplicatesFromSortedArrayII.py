'''
TC: O(n)
SC: O(1)
'''
from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i,j = 0,0
        count = 0
        curr = nums[0]
        while j<len(nums):
            if nums[j] != curr:
                curr = nums[j]
                nums[i] = nums[j]
                count = 1
                i+=1
                j += 1
            else:
                if count <2:
                    nums[i] = nums[j]
                    i+=1
                    j+=1
                    count += 1
                else:
                    j+=1
        print(nums)
        return i
s = Solution()
print(s.removeDuplicates([1,1,1,2,2,3]))
print(s.removeDuplicates([0,0,1,1,1,1,2,3,3]))
print(s.removeDuplicates([1,1,1,1,2,2,2,3,4,4,4,4,4,5,5,6,6,6,6,7,7]))
