class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        if len(nums) == 1: return 1
        l = 1
        cur = 1
        count = 1
        prev = nums[0]
        while cur < len(nums):
            if prev == nums[cur]:
                if count < 2:
                    nums[l] = nums[cur]
                    l += 1
                    cur += 1
                    count += 1
                
                else:
                    while cur < len(nums) and prev == nums[cur]:
                        cur+=1
                    
                    if cur < len(nums):
                        nums[l] = nums[cur]
                        prev = nums[cur]
                        l+=1
                        cur+=1
                        count = 1
                    else:
                        break
                    
            else:
                nums[l] = nums[cur]
                prev = nums[cur]
                cur+=1
                count = 1
                l+=1

        return l
                
                



