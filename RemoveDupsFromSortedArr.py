class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        fast=0
        slow=0
        count=0
        while fast<=len(nums)-1:
            print(slow, fast)
            if fast!=0 and nums[fast]==nums[fast-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[slow]=nums[fast]
                slow+=1
            fast+=1
        return len(nums[:slow])
    
    
    """Time complexity - O(n)
    Space complexity - O(1)"""
        # arr={}
        # li = []
        # for i in range(len(nums)):
        #     if nums[i] not in arr:
        #         arr[nums[i]]=1
        #     else:
        #         arr[nums[i]]+=1
        # print(arr)
        # for keys in arr:
        #     print(arr[keys])
        #     if arr[keys]==1:
        #         li.append(keys)
        #     elif arr[keys]>=2:
        #         li.append(keys)
        #         li.append(keys)
        #     else:
        #         pass
        # for i in range(len(li)):
        #     nums[i] = li[i]
        # return len(nums[:len(li)])

                
                
        